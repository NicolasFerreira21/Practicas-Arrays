package ejArrays;

import java.util.ArrayList;

public class festival {
	public String nombre;
	public proyeccion[] proyecciones;
	
	public festival(proyeccion[] p) {
		this.nombre = "festival";
		this.proyecciones = new proyeccion[p.length];
		for (int i=0; i<p.length;i++) {
			this.proyecciones[i]=p[i];
		}
		
	}
	public int cantProyecciones(int f) {
		int c=0;
		for (int i=0; i<proyecciones.length; i++) {
			if (proyecciones[i].fecha==f) {
				c++;
			}
		}
		return c;
	}
	ArrayList<String> directoresPrometedores(){
		ArrayList<String>Directores= new ArrayList<String>();
		for (int i=0; i<proyecciones.length;i++) {
			if (proyecciones[i].Sala.capacidad>=150) {
				Directores.add(proyecciones[i].Pelicula.director);
			}
		}
		return Directores;
	}
	public static void main(String[] args) {
		pelicula a=new pelicula("mandingo", 2010, "mandingo");
		pelicula b=new pelicula("mandingo 2", 2011, "mandingo");
		pelicula c=new pelicula("as", 2016, "tarantino");
		sala s1= new sala("1", 150);
		sala s2= new sala("2", 200);
		sala s3= new sala("3", 100);
		proyeccion p1= new proyeccion(s1, a, 14);
		proyeccion p2= new proyeccion(s2, c, 14);
		proyeccion p3= new proyeccion(s3, b, 14);
		proyeccion[] pp= new proyeccion[3];
		pp[0]=p1;
		pp[1]=p2;
		pp[2]=p3;
		
		festival f= new festival(pp);
		System.out.println(f.directoresPrometedores().size());
		ArrayList<String>d= new ArrayList<String>(f.directoresPrometedores().size());
		for (int k=0; k<f.directoresPrometedores().size(); k++){
			d.add(f.directoresPrometedores().get(k));
		}
		for (int l=0; l<d.size(); l++){
			System.out.println(d.get(l));
		}
	}
}
