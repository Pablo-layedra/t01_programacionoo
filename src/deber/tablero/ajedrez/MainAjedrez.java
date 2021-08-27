package deber.tablero.ajedrez;

import java.util.Arrays;

public class MainAjedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PiezaPeon peonBlanco1=new PiezaPeon();
		peonBlanco1.setColor("Blanco");
		
		PiezaPeon peonBlanco2=new PiezaPeon();
		peonBlanco2.setColor("Blanco");
		
		PiezaPeon peonBlanco3=new PiezaPeon();
		peonBlanco3.setColor("Blanco");
		
		PiezaPeon peonBlanco4=new PiezaPeon();
		peonBlanco4.setColor("Blanco");
		
		PiezaPeon peonBlanco5=new PiezaPeon();
		peonBlanco5.setColor("Blanco");
		
		PiezaPeon peonBlanco6=new PiezaPeon();
		peonBlanco6.setColor("Blanco");
		
		PiezaPeon peonBlanco7=new PiezaPeon();
		peonBlanco7.setColor("Blanco");
		
		PiezaPeon peonBlanco8=new PiezaPeon();
		peonBlanco8.setColor("Blanco");
		
		PiezaPeon peonNegro1=new PiezaPeon();
		peonNegro1.setColor("Negro");
		
		PiezaPeon peonNegro2=new PiezaPeon();
		peonNegro2.setColor("Negro");
		
		PiezaPeon peonNegro3=new PiezaPeon();
		peonNegro3.setColor("Negro");
		
		PiezaPeon peonNegro4=new PiezaPeon();
		peonNegro4.setColor("Negro");
		
		PiezaPeon peonNegro5=new PiezaPeon();
		peonNegro5.setColor("Negro");
		
		PiezaPeon peonNegro6=new PiezaPeon();
		peonNegro6.setColor("Negro");
		
		PiezaPeon peonNegro7=new PiezaPeon();
		peonNegro7.setColor("Negro");
		
		PiezaPeon peonNegro8=new PiezaPeon();
		peonNegro8.setColor("Negro");
		
		PiezaTorre torreBlanco=new PiezaTorre();
		torreBlanco.setColor("Blanco");
		
		PiezaTorre torreNegro=new PiezaTorre();
		torreNegro.setColor("Negro");
		
		PiezaCaballo caballoBlanco=new PiezaCaballo();
		caballoBlanco.setColor("Blanco");
		
		PiezaCaballo caballoNegro=new PiezaCaballo();
		caballoNegro.setColor("Negro");
		
		PiezaAlfil alfilBlanco=new PiezaAlfil();
		alfilBlanco.setColor("Blanco");
		
		PiezaAlfil alfilNegro=new PiezaAlfil();
		alfilNegro.setColor("Negro");
		
		PiezaReina reinaBlanco=new PiezaReina();
		reinaBlanco.setColor("Blanco");
		
		PiezaReina reinaNegro=new PiezaReina();
		reinaNegro.setColor("Negro");
		
		PiezaReina reyNegro=new PiezaReina();
		reyNegro.setColor("Negro");
		
		PiezaReina reyBlanco=new PiezaReina();
		reyBlanco.setColor("Negro");
		
		
		AjedrezPiezas Tablero[][]=new AjedrezPiezas [8][8];
		Tablero[0][0]=torreNegro;
		Tablero[0][1]=caballoNegro;
		Tablero[0][2]=alfilNegro;
		Tablero[0][3]=reyNegro;
		Tablero[0][4]=reinaNegro;
		Tablero[0][5]=alfilNegro;
		Tablero[0][6]=caballoNegro;
		Tablero[0][7]=torreNegro;
		Tablero[1][0]=peonNegro1;
		Tablero[1][1]=peonNegro2;
		Tablero[1][2]=peonNegro3;
		Tablero[1][3]=peonNegro4;
		Tablero[1][4]=peonNegro5;
		Tablero[1][5]=peonNegro6;
		Tablero[1][6]=peonNegro7;
		Tablero[1][7]=peonNegro8;
		
		Tablero[7][0]=torreBlanco;
		Tablero[7][1]=caballoBlanco;
		Tablero[7][2]=alfilBlanco;
		Tablero[7][3]=reyBlanco;
		Tablero[7][4]=reinaBlanco;
		Tablero[7][5]=alfilBlanco;
		Tablero[7][6]=caballoBlanco;
		Tablero[7][7]=torreBlanco;
		Tablero[6][0]=peonBlanco1;
		Tablero[6][1]=peonBlanco2;
		Tablero[6][2]=peonBlanco3;
		Tablero[6][3]=peonBlanco4;
		Tablero[6][4]=peonBlanco5;
		Tablero[6][5]=peonBlanco6;
		Tablero[6][6]=peonBlanco7;
		Tablero[6][7]=peonBlanco8;
		
		
		System.out.println(Arrays.toString(Tablero));
		

	}

}
