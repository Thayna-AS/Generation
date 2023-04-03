programa 
{
	inclua biblioteca Matematica --> mat 
	//Recentemente, Camila começou a desempenhar sua nova função de desenvolvedora Java júnior em um banco. 
	//Ela está administrando as contas dos clientes para uma nova solução bancária.
	//Camila é convidada a implementar um recurso que mostra o maior dos três valores na tela inicial.
	
	funcao inicio()
	{
	// Criação de vetor
		 inteiro valor[]= {900,500,760}
		 inteiro valorMaior = 0
		 

		
	
	// estrutura de repetição 
		para(inteiro i=0; i < 3; i++){
			se(valorMaior < valor[i])
			{
				valorMaior = valor[i]
			}			
		}

		escreva(valorMaior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */