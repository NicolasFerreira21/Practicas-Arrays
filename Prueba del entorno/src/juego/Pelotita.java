package juego;

import java.awt.Color;

import entorno.Entorno;

public class Pelotita {
	
	private int diametro;
	private Color color;
	private int x;
	private int y;
	private double deltaX;
	private double deltaY;
	private double aceleracion;
	
	public Pelotita(int x, int y, int diametro, Color color, double deltaX, double deltaY)
	{
		this.x = x;
		this.y = y;
		this.diametro = diametro;
		this.color = color;
		this.deltaX = deltaX;
		this.deltaY = deltaY;
		this.aceleracion = 0.98; 
	}
	
	public void dibujarse(Entorno entorno)
	{
		entorno.dibujarCirculo(this.x, this.y, this.diametro, this.color);
	}

	public void moverse(Entorno entorno) {
		this.x = (int) (this.x + this.deltaX);
		this.y = (int) (this.y + this.deltaY);
		
		this.deltaX = this.deltaX * aceleracion;
		this.deltaY = this.deltaY * aceleracion;
		
		if(this.x < 0 || this.x > entorno.ancho())
			this.deltaX = -this.deltaX;
		if(this.y < 0 || this.y > entorno.alto())
			this.deltaY = -this.deltaY;
		
		if(Math.abs(this.deltaX) < 0.01)
			deltaX = 0;
		if(Math.abs(this.deltaY) < 0.01)
			deltaY = 0;
	}

}
