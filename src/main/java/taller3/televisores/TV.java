package taller3.televisores;

public class TV {
	
	Marca marca;
	private int canal;
	private int precio;
	boolean estado;
	private int volumen;
	Control control;
	public static int numTV=0;
	
	public TV(Marca marca,boolean estado) {
		this.canal=1;
		this.volumen=1;
		this.precio=500;
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}


	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
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

	public void setEstado(boolean estado){
		this.estado=estado;
	}

	public boolean getEstado(){
		return estado;
	}

	public void canalUp() {
		if (estado && canal<120) {
			canal++;
		}
	}
	
	public void canalDown() {
		if (estado && canal>1) {
			canal--;
		}
	}

	public void volumenUp() {
		if (estado && volumen<7) {
			volumen++;
		}
	}

	public void volumenDown() {
		if (estado && volumen>1) {
			volumen--;
		}
	}
	
	

}
