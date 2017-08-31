package br.cefet.rj;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		//RandomAccessFile f = new RandomAccessFile("cep_ordenado.dat", "r");
		
		Endereco e = new Endereco();
		long menor = 0;
		long maior = f.length()-1;
		long meio;
		while(f.getFilePointer() <= f.length()) {
			meio = menor + ((maior - menor) / 2);
			f.seek(meio);
			e.leEndereco(f);
			System.out.println(e.getCep());
			long eCep = Integer.parseInt(e.getCep());
			if(Integer.parseInt(args[0]) < eCep) {
				maior = meio - 1;
			} else if (Integer.parseInt(args[0]) > eCep){
				menor = meio + 1;
			} else {
				System.out.println(e.getCep());
				System.out.println(e.getBairro());
				System.out.println("qualquer coisa");
			}
			
			
		}
		f.close();
		scan.close();
	}

}
