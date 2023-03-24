package practica6.src.practica6;

import java.util.Date;

import javax.swing.RepaintManager;

import patron_Generico.atributos_gen;

import java.text.DecimalFormat;

public class estudiantes extends Thread {
	private registro rg;
	private atributos_gen<String, Double>datos;
	DecimalFormat df=new DecimalFormat("#.00");
	double cont=0.0,cont1=0.0;
	int A1=0,A11=0,S1=0,S11=0,R1=0,R11=0,
		A2=0,A22=0,S2=0,S22=0,R2=0,R22=0,
		A3=0,A33=0,S3=0,S33=0,R3=0,R33=0,
		A4=0,A44=0,S4=0,S44=0,R4=0,R44=0,
		A5=0,A55=0,S5=0,S55=0,R5=0,R55=0;
	
	public estudiantes(registro rg_, String tipo) {
		this.rg=rg_;
		datos=new atributos_gen<String,Double>(tipo,0.0);
		datos.setAtributoS5(0.0);
		datos.setAtributoS6(0.0);
	}
	public void run() {
		
		for(int i=0;i<30;i++) {
			
			double n1=Math.random()*7+3;
			double n2=Math.random()*7+3;
			double n3=Math.random()*7+3;
			double n4=Math.random()*7+3;
			double n5=Math.random()*7+3;
			double n6=Math.random()*7+3;
			double n7=Math.random()*7+3;
			double n8=Math.random()*7+3;
			double n9=Math.random()*7+3;
			double n10=Math.random()*7+3;
			
			switch(datos.getAtributoT1()) {
			case "docente1":
				
				Object [] fila= new  Object[13];
				double prom=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
				
				
				fila[0]=String.valueOf(i+1);
				fila[1]=String.valueOf(df.format(n1));
				fila[2]=String.valueOf(df.format(n2));
				fila[3]=String.valueOf(df.format(n3));
				fila[4]=String.valueOf(df.format(n4));
				fila[5]=String.valueOf(df.format(n5));
				fila[6]=String.valueOf(df.format(n6));
				fila[7]=String.valueOf(df.format(n7));
				fila[8]=String.valueOf(df.format(n8));
				fila[9]=String.valueOf(df.format(n9));
				fila[10]=String.valueOf(df.format(n10));
				fila[11]=String.valueOf(df.format(prom));
				if(prom>=70) {
					fila[12]= "APROBADO";
					A1+=1;
					A11=A1;	
				}else if (prom >=65 && prom <70) {
					fila[12]= "SUSPENSO";		
					S1+=1;
					S11=S1;
				}else{
					fila[12]= "REPROBADO";
					R1+=1;
					R11=R1;
				}
				rg.lbl_porc_AD1.setText(String.valueOf(porcentaje(A11)));
				rg.lbl_porc_SD1.setText(String.valueOf(porcentaje(S11)));
				rg.lbl_porc_RD1.setText(String.valueOf(porcentaje(R11)));
				rg.model.addRow(fila);
				datos.setAtributoS4((datos.getAtributoS4()+prom));
				rg.lbl_promtotalD1.setText(String.valueOf(df.format(datos.getAtributoS4()/30)));
				
				
				
				break;
			case "docente2":
				Object [] fila1= new  Object[13];
				double prom1=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
				
				fila1[0]=String.valueOf(i+1);
				fila1[1]=String.valueOf(df.format(n1));
				fila1[2]=String.valueOf(df.format(n2));
				fila1[3]=String.valueOf(df.format(n3));
				fila1[4]=String.valueOf(df.format(n4));
				fila1[5]=String.valueOf(df.format(n5));
				fila1[6]=String.valueOf(df.format(n6));
				fila1[7]=String.valueOf(df.format(n7));
				fila1[8]=String.valueOf(df.format(n8));
				fila1[9]=String.valueOf(df.format(n9));
				fila1[10]=String.valueOf(df.format(n10));
				fila1[11]=String.valueOf(df.format(prom1));
				if(prom1>=70) {
					fila1[12]= "APROBADO";
					A2+=1;
					A22=A2;	
				}else if (prom1 >=65 && prom1 <70) {
					fila1[12]= "SUSPENSO";		
					S2+=1;
					S22=S2;
				}else{
					fila1[12]= "REPROBADO";
					R2+=1;
					R22=R2;
				}
				rg.lbl_porc_AD2.setText(String.valueOf(porcentaje(A22)));
				rg.lbl_porc_SD2.setText(String.valueOf(porcentaje(S22)));
				rg.lbl_porc_RD2.setText(String.valueOf(porcentaje(R22)));
				rg.model2.addRow(fila1);
				datos.setAtributoS5((datos.getAtributoS5()+prom1));
				rg.lbl_promtotalD2.setText(String.valueOf(df.format(datos.getAtributoS5()/30)));
				
				break;
			case "docente3":
				Object [] fila2= new  Object[13];
				double prom2=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
				
				fila2[0]=String.valueOf(i+1);
				fila2[1]=String.valueOf(df.format(n1));
				fila2[2]=String.valueOf(df.format(n2));
				fila2[3]=String.valueOf(df.format(n3));
				fila2[4]=String.valueOf(df.format(n4));
				fila2[5]=String.valueOf(df.format(n5));
				fila2[6]=String.valueOf(df.format(n6));
				fila2[7]=String.valueOf(df.format(n7));
				fila2[8]=String.valueOf(df.format(n8));
				fila2[9]=String.valueOf(df.format(n9));
				fila2[10]=String.valueOf(df.format(n10));
				fila2[11]=String.valueOf(df.format(prom2));
				if(prom2>=70) {
					fila2[12]= "APROBADO";
					A3+=1;
					A33=A3;	
				}else if (prom2 >=65 && prom2 <70) {
					fila2[12]= "SUSPENSO";		
					S3+=1;
					S33=S3;
				}else{
					fila2[12]= "REPROBADO";
					R3+=1;
					R33=R3;
				}
				rg.lbl_porc_AD3.setText(String.valueOf(porcentaje(A33)));
				rg.lbl_porc_SD3.setText(String.valueOf(porcentaje(S33)));
				rg.lbl_porc_RD3.setText(String.valueOf(porcentaje(R33)));
				rg.model3.addRow(fila2);
				datos.setAtributoS6((datos.getAtributoS6()+prom2));
				rg.lbl_promtotalD3.setText(String.valueOf(df.format(datos.getAtributoS6()/30)));
				break;
			case "docente4":
				Object [] fila3= new  Object[13];
				double prom3=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
				
				fila3[0]=String.valueOf(i+1);
				fila3[1]=String.valueOf(df.format(n1));
				fila3[2]=String.valueOf(df.format(n2));
				fila3[3]=String.valueOf(df.format(n3));
				fila3[4]=String.valueOf(df.format(n4));
				fila3[5]=String.valueOf(df.format(n5));
				fila3[6]=String.valueOf(df.format(n6));
				fila3[7]=String.valueOf(df.format(n7));
				fila3[8]=String.valueOf(df.format(n8));
				fila3[9]=String.valueOf(df.format(n9));
				fila3[10]=String.valueOf(df.format(n10));
				fila3[11]=String.valueOf(df.format(prom3));
				if(prom3>=70) {
					fila3[12]= "APROBADO";
					A4+=1;
					A44=A4;	
				}else if (prom3 >=65 && prom3 <70) {
					fila3[12]= "SUSPENSO";		
					S4+=1;
					S44=S4;
				}else{
					fila3[12]= "REPROBADO";
					R4+=1;
					R44=R4;
				}
				rg.lbl_porc_AD4.setText(String.valueOf(porcentaje(A44)));
				rg.lbl_porc_SD4.setText(String.valueOf(porcentaje(S44)));
				rg.lbl_porc_RD4.setText(String.valueOf(porcentaje(R44)));
				rg.model4.addRow(fila3);
				cont=cont+prom3;
				double a=cont;

				rg.lbl_promtotalD4.setText(String.valueOf(df.format(a/30)));
				break;
			case "docente5":
				Object [] fila4= new  Object[13];
				double prom4=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
				
				fila4[0]=String.valueOf(i+1);
				fila4[1]=String.valueOf(df.format(n1));
				fila4[2]=String.valueOf(df.format(n2));
				fila4[3]=String.valueOf(df.format(n3));
				fila4[4]=String.valueOf(df.format(n4));
				fila4[5]=String.valueOf(df.format(n5));
				fila4[6]=String.valueOf(df.format(n6));
				fila4[7]=String.valueOf(df.format(n7));
				fila4[8]=String.valueOf(df.format(n8));
				fila4[9]=String.valueOf(df.format(n9));
				fila4[10]=String.valueOf(df.format(n10));
				fila4[11]=String.valueOf(df.format(prom4));
				if(prom4>=70) {
					fila4[12]= "APROBADO";
					A5+=1;
					A55=A5;	
				}else if (prom4 >=65 && prom4 <70) {
					fila4[12]= "SUSPENSO";		
					S5+=1;
					S55=S5;
				}else{
					fila4[12]= "REPROBADO";
					R5+=1;
					R55=R5;
				}
				rg.lbl_porc_AD5.setText(String.valueOf(porcentaje(A55)));
				rg.lbl_porc_SD5.setText(String.valueOf(porcentaje(S55)));
				rg.lbl_porc_RD5.setText(String.valueOf(porcentaje(R55)));
				rg.model5.addRow(fila4);
				cont=cont+prom4;
				double b=cont;

				rg.lbl_promtotalD5.setText(String.valueOf(df.format(b/30)));
				break;
			
			}
			rg.repaint();
			try {
				this.sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		
		
	}

	public String porcentaje (double valor) {
		double porc=(valor*100)/30;
		return df.format(porc);
	}

	

}
