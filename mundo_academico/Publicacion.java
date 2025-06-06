package mundo_academicoo;

	public class Publicacion {
		 private String titulo;
		 private String autor;
		 private int año;
		 
		 public Publicacion (String titulo,String autor,int año) {
			 this.titulo = titulo;
			 this.autor  = autor ;
			 this.año  = año ;
		 }

		public String getTitulo() {
			return titulo;
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

		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			this.año = año;
		}
		
		}
