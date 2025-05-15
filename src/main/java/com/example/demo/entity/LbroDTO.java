package com.example.demo.entity;



public class LbroDTO {


	    private String titulo;


	    private String autor;


	    private String isbn;


	    private Integer anioPublicacion;
	    
	    

		/*public Libro() {
			super();
		}

		public Libro(Long id, String titulo, String autor, String isbn, Integer anioPublicacion) {
			super();
			this.id = id;
			this.titulo = titulo;
			this.autor = autor;
			this.isbn = isbn;
			this.anioPublicacion = anioPublicacion;
		}*/

	   // public Libro() {}
	/*	public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}*/

		public String getTitulo() {
			return titulo;
		}

		public LbroDTO(String titulo, String autor, String isbn, Integer anioPublicacion) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.isbn = isbn;
			this.anioPublicacion = anioPublicacion;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public Integer getAnioPublicacion() {
			return anioPublicacion;
		}

		public void setAnioPublicacion(Integer anioPublicacion) {
			this.anioPublicacion = anioPublicacion;
		}
	    
	    
}
