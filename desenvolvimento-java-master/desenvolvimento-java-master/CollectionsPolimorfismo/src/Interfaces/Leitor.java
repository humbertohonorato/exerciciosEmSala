package Interfaces;

	interface Leitor {

		String lendo();
	
	}

	interface Programador {
		void pensando(char[] ideias);
		String digitando();
	}

	class ParticipanteForum implements Leitor, Programador {
			
		String pensamento;
		public String lendo() { //método definido na interface leitor
		return "Forum";
		}
		
		public void pensando(char[] ideias) { //método definido na interface Programador
			pensamento = new String(ideias);
		}
		
		public String digitando() { //método definido na interface Programador
			return pensamento;
		}
		
		private String aprendendo() { //método exclusivo desta classe
			return "Java";
		}
	
	}
