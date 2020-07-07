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
		public String lendo() { //m�todo definido na interface leitor
		return "Forum";
		}
		
		public void pensando(char[] ideias) { //m�todo definido na interface Programador
			pensamento = new String(ideias);
		}
		
		public String digitando() { //m�todo definido na interface Programador
			return pensamento;
		}
		
		private String aprendendo() { //m�todo exclusivo desta classe
			return "Java";
		}
	
	}
