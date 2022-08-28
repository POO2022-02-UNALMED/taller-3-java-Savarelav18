package taller3.televisores;

public class TV {
	
	Marca marca;
	private int canal;
	private int precio;
	boolean estado;
	private int volumen;
	Control control;
	private static int numTV;
	
	public TV(Marca marca,boolean estado) {
		this.canal=1;
		this.volumen=1;
		this.precio=500;
		this.marca=marca;
		this.estado=estado;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {estado=true;}
	
	public void turnOff() {estado=false;}
	
	public void canalUp() {
		
		if (estado != true) {
			System.out.println("El televisor debe estar encendido");
			return;
		}
		
		if (canal>120) {
			return;
		}
		else {
			canal++;
		}
		
	}
	
	public void canalDown() {
		
		if (estado != true) {
			System.out.println("El televisor debe estar encendido");
			return;
		}
		
		if (canal<1) {
			return;
		}
		else {
			canal--;
		}
		
	}
	
	public void volumenUp() {
		
		if (estado != true) {
			System.out.println("El televisor debe estar encendido");
			return;
		}
		
		if (volumen>7) {
			return;
		}
		else {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if (estado != true) {
			System.out.println("El televisor debe estar encendido");
			return;
		}
		
		if (volumen<0) {
			return;
		}
		else {
			volumen++;
		}
	}
	
	

}
