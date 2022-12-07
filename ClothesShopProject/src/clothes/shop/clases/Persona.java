package clothes.shop.clases;

public abstract class Persona {
	
	private int id;
	private String nombre;
	private String apellido;
	private String fotoPerfil;
	
	public Persona(int id, String nombre, String apellido, String fotoPerfil) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fotoPerfil = fotoPerfil;
	}
	
	public Persona() {
		super();
		this.id = 0;
		this.nombre = null;
		this.apellido = null;
		this.fotoPerfil = "foto/fotoPerfilPredeterminada.jpg";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	@Override
	public String toString() {
		return String.format("(%s)" +  " %s %s", id, nombre, apellido);
	}
	
	//TODO: Crear credenciales de inicio de sesion predeterminadas

}
