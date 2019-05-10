package contabilidad.costos.nittiotremo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Ventanita extends JFrame implements ActionListener
{
    float materia1,materia2,materia3,mano1,mano2,mano3,codir1,codir2,codir3,coind1,coind2,coind3,luz,agua,gas,dias1,dias2,dias3,kil1,kil2,kil3;
    float Vtotaldiario1,Vtotaldiario2,Vtotaldiario3,Vtotalmensual1,Vtotalmensual2,Vtotalmensual3,Vresfinal,Vtotalunitario1,Vtotalunitario2,Vtotalunitario3;

                            private JLabel materia_prima;
                            private JLabel mano_de_obra;
                            private JLabel costo_directo;
                            private JLabel costo_indirecto;
                            private JLabel txtdias;
                            private JLabel kilo1;
                            
                            private JLabel materia_prima2;
                            private JLabel mano_de_obra2;
                            private JLabel costo_directo2;
                            private JLabel costo_indirecto2;
                            private JLabel txtdias2;
                            private JLabel kilo2;
                            
                            private JLabel materia_prima3;
                            private JLabel mano_de_obra3;
                            private JLabel costo_directo3;
                            private JLabel costo_indirecto3;
                            private JLabel txtdias3;
                            private JLabel kilo3;
                            
                            private JLabel txtluz;
                            private JLabel txtagua;
                            private JLabel txtgas;
                            
                            private JLabel totaldiario1,totalmensual1,totaldiario2,totalmensual2,totaldiario3,totalmensual3,total;
                            private JLabel fresco,oaxaca,chongos;
                            
///////////////////////////////////////////////////////////////////////////////////////////
                            
                            private JTextField cajamateria;
                            private JTextField cajamano;
                            private JTextField cajacodir;
                            private JTextField cajacoind;
                            private JTextField cajadias;
                            
                            private JTextField cajamateria2;
                            private JTextField cajamano2;
                            private JTextField cajacodir2;
                            private JTextField cajacoind2;
                            private JTextField cajadias2;
                            
                            private JTextField cajamateria3;
                            private JTextField cajamano3;
                            private JTextField cajacodir3;
                            private JTextField cajacoind3;
                            private JTextField cajadias3;
                            
                            private JTextField ck1;
                            private JTextField ck2;
                            private JTextField ck3;
                            
                            private JTextField cajaagua; 
                            private JTextField cajaluz;
                            private JTextField cajagas; 
                           

                            private JButton aceptar;

public Ventanita()
        {
            configurarVentanita();    
          inicializarcomponentes();
}
private void configurarVentanita()
                    {
                        this.setTitle ("Costos Taller lacteos");
                        this.setSize(850,550);
                        this.setLocationRelativeTo(null);
                        this.setLayout(null);
                        this.setResizable(false);
                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

 private void inicializarcomponentes()
{

                             materia_prima= new JLabel();
                             mano_de_obra= new JLabel();
                            costo_directo= new JLabel();
                             costo_indirecto= new JLabel(); 
                             kilo1= new JLabel();
                             txtdias= new JLabel();
                             
                            totaldiario1 = new JLabel();
                            totalmensual1= new JLabel();

                             
                             materia_prima2= new JLabel();
                             mano_de_obra2= new JLabel();
                              costo_directo2= new JLabel();
                             costo_indirecto2= new JLabel();
                             kilo2= new JLabel();
                             txtdias2= new JLabel();
                             
                             totaldiario2= new JLabel();
                             totalmensual2= new JLabel();

                             
                             materia_prima3= new JLabel();
                             mano_de_obra3= new JLabel();
                            costo_directo3= new JLabel();
                             costo_indirecto3= new JLabel(); 
                             kilo3= new JLabel(); 
                             txtdias3= new JLabel();
                             
                             totaldiario3= new JLabel();
                             totalmensual3= new JLabel();
                                                         
                             txtluz= new JLabel();
                             txtagua= new JLabel();
                             txtgas= new JLabel();
                                
                             total= new JLabel();
                             fresco= new JLabel();
                             oaxaca = new JLabel();
                             chongos = new JLabel();
                             
     //////////////////////////////////////////////////////////////////////////////////                         
    //////////////////////////////////////////////////////////////////////////////////                        
   //////////////////////////////////////////////////////////////////////////////////                         
                             
                             
                           
                           cajamateria=new JTextField();
                           cajamano=new JTextField();
                           cajacodir=new JTextField();
                           cajacoind=new JTextField();
                           ck1=new JTextField();
                           cajadias=new JTextField();
                           
                           
                           cajamateria2=new JTextField();
                           cajamano2=new JTextField();
                           cajacodir2=new JTextField();
                           cajacoind2=new JTextField();
                           ck2=new JTextField();
                           cajadias2=new JTextField();
                           
                           cajamateria3=new JTextField();
                           cajamano3=new JTextField();
                           cajacodir3=new JTextField();
                           cajacoind3=new JTextField();
                           ck3=new JTextField();
                           cajadias3=new JTextField();
                           
                           cajaagua=new JTextField();
                           cajaluz=new JTextField();
                           cajagas=new JTextField();
                           
                           
                           aceptar=new JButton();
                           
                           
                           ////////////////////////////////////////////////////////////////////////
                           ///////////////////////////////////////////////////////////////////////
                           //////////////////////////////////////////////////////////////////////
                           
                           //QUESO FRESCO
                           
                           fresco.setText("Queso Fresco");
                           fresco.setBounds(10,10,100,25);
                           
                          
                          materia_prima.setText("Materia Prima");
                          materia_prima.setBounds(50,45,100,25);
                          cajamateria.setBounds(135,45,100,25);
                          
                           mano_de_obra.setText("Mano de Obra");
                           mano_de_obra.setBounds(245,45,100,25);
                           cajamano.setBounds(330,45,100,25);
                           
                           costo_directo.setText("Costo Directo");
                           costo_directo.setBounds(50,80,100,25);
                           cajacodir.setBounds(135,80,100,25);
                           
                           costo_indirecto.setText("Costo Indirecto");
                           costo_indirecto.setBounds(245,80,100,25);
                           cajacoind.setBounds(330,80,100,25);
                           
                           kilo1.setText("Kilos Producidos");
                           kilo1.setBounds(440,45,100,25);
                            ck1.setBounds(555,45,100,25);
                           
                           txtdias.setText("Dias dedicados");
                           txtdias.setBounds(440,80,100,25);
                           cajadias.setBounds(555,80,100,25);
                           

               //QUESO OAXACA
                           
                           oaxaca.setText("Queso Oaxaca");
                           oaxaca.setBounds(10,120,100,25);
                           
                          
                          materia_prima2.setText("Materia Prima");
                          materia_prima2.setBounds(50,165,100,25);
                          cajamateria2.setBounds(135,165,100,25);
                          
                           mano_de_obra2.setText("Mano de Obra");
                           mano_de_obra2.setBounds(245,165,100,25);
                           cajamano2.setBounds(330,165,100,25);
                           
                           costo_directo2.setText("Costo Directo");
                           costo_directo2.setBounds(50,200,100,25);
                           cajacodir2.setBounds(135,200,100,25);
                           
                           costo_indirecto2.setText("Costo Indirecto");
                           costo_indirecto2.setBounds(245,200,100,25);
                           cajacoind2.setBounds(330,200,100,25);
                           
                           kilo2.setText("Kilos Producidos");
                           kilo2.setBounds(440,165,100,25);
                            ck2.setBounds(555,165,100,25);
                           
                           txtdias2.setText("Dias dedicados");
                           txtdias2.setBounds(440,200,100,25);
                           cajadias2.setBounds(555,200,100,25);
                           
                           
                           
                           //chongos

                            chongos.setText("Chongos ");
                           chongos.setBounds(10,230,100,25);
                           
                          
                          materia_prima3.setText("Materia Prima");
                          materia_prima3.setBounds(50,275,100,25);
                          cajamateria3.setBounds(135,275,100,25);
                          
                           mano_de_obra3.setText("Mano de Obra");
                           mano_de_obra3.setBounds(245,275,100,25);
                           cajamano3.setBounds(330,275,100,25);
                           
                           costo_directo3.setText("Costo Directo");
                           costo_directo3.setBounds(50,310,100,25);
                           cajacodir3.setBounds(135,310,100,25);
                           
                           costo_indirecto3.setText("Costo Indirecto");
                           costo_indirecto3.setBounds(245,310,100,25);
                           cajacoind3.setBounds(330,310,100,25);
                           
                           kilo3.setText("Kilos Producidos");
                           kilo3.setBounds(440,275,100,25);
                            ck3.setBounds(555,275,100,25);
                           
                           txtdias3.setText("Dias dedicados");
                           txtdias3.setBounds(440,310,100,25);
                           cajadias3.setBounds(555,310,100,25);
                           
                           
                           //extras y boton
                           
                         /*   txtagua.setText("Agua/Mes ");
                          txtagua.setBounds(50,425,100,25);
                          cajaagua.setBounds(135,425,100,25);
                          
                           txtluz.setText(" Luz/Mes");
                           txtluz.setBounds(245,425,100,25);
                           cajaluz.setBounds(330,425,100,25);

                           txtgas.setText("Gas/Mes ");
                           txtgas.setBounds(440,425,100,25);
                            cajagas.setBounds(555,425,100,25);
                           
                           */
                            
                         aceptar.setText("Aceptar  ");
                        aceptar.setBounds(25,425,800,35);
                        aceptar.addActionListener(this);   
                                    
                                    
                                    
               //adds
                         
                          this.add(fresco);
                          this.add(materia_prima);
                          this.add(cajamateria);
                          this.add(mano_de_obra);
                          this.add(cajamano);
                          this.add(costo_directo);
                          this.add(cajacodir);
                          this.add(costo_indirecto);
                          this.add(cajacoind);
                          this.add(kilo1);
                          this.add(ck1);
                          this.add(cajadias);
                          this.add(txtdias);
                         
                          this.add(oaxaca);
                          this.add(materia_prima2);
                          this.add(cajamateria2);
                          this.add(mano_de_obra2);
                          this.add(cajamano2);
                          this.add(costo_directo2);
                          this.add(cajacodir2);
                          this.add(costo_indirecto2);
                          this.add(cajacoind2);
                          this.add(kilo2);
                          this.add(ck2);
                          this.add(cajadias2);
                          this.add(txtdias2);
                          
                          this.add(chongos);
                          this.add(materia_prima3);
                          this.add(cajamateria3);
                          this.add(mano_de_obra3);
                          this.add(cajamano3);
                          this.add(costo_directo3);
                          this.add(cajacodir3);
                          this.add(costo_indirecto3);
                          this.add(cajacoind3);
                          this.add(kilo3);
                          this.add(ck3);
                          this.add(cajadias3);
                          this.add(txtdias3);
                         
                          this.add(txtagua);
                          this.add(txtluz);
                          this.add(txtgas);
                          this.add(cajaluz);
                          this.add(cajaagua);
                          this.add(cajagas);
                          this.add(aceptar);

                          this.add(totalmensual1);
                          this.add(totaldiario1);
                          this.add(totalmensual2);
                          this.add(totaldiario2);
                          this.add(totalmensual3);
                          this.add(totaldiario3);
                          this.add(total);
}
 


    @Override
    public void actionPerformed(ActionEvent click) {
        
        if(click.getSource()==aceptar)
        {
           // variablle=INteger.parseInt(caja.getText())
            
            
            materia1=Integer.parseInt(cajamateria.getText());
            mano1=Integer.parseInt(cajamano.getText());
            codir1=Integer.parseInt(cajacodir.getText());
            coind1=Integer.parseInt(cajacoind.getText());
            dias1=Integer.parseInt(cajadias.getText());
            kil1=Integer.parseInt(ck1.getText());
            
            Vtotaldiario1=materia1+mano1+codir1+coind1;
            Vtotalunitario1=Vtotaldiario1/kil1;
            Vtotalmensual1=Vtotaldiario1*dias1;
                    
                    
                    //////////////////////////////////////////////////////////
                    
            materia2=Integer.parseInt(cajamateria2.getText());
            mano2=Integer.parseInt(cajamano2.getText());
            codir2=Integer.parseInt(cajacodir2.getText());
            coind2=Integer.parseInt(cajacoind2.getText());
            dias2=Integer.parseInt(cajadias2.getText());
            kil2=Integer.parseInt(ck2.getText());
            
            Vtotaldiario2=materia2+mano2+codir2+coind2;
            Vtotalunitario2=Vtotaldiario2/kil2;
            Vtotalmensual2=Vtotaldiario2*dias2;
            
                    /////////////////////////////////////////////////////////
                    
            materia3=Integer.parseInt(cajamateria3.getText());
            mano3=Integer.parseInt(cajamano3.getText());
            codir3=Integer.parseInt(cajacodir3.getText());
            coind3=Integer.parseInt(cajacoind3.getText());
            dias3=Integer.parseInt(cajadias3.getText());
            kil3=Integer.parseInt(ck3.getText());
            
            Vtotaldiario3=materia3+mano3+codir3+coind3;
            Vtotalunitario3=Vtotaldiario3/kil3;
            Vtotalmensual3=Vtotaldiario3*dias3;
            
            Vresfinal=Vtotalmensual1+Vtotalmensual2+Vtotalmensual3;
            
           JOptionPane.showMessageDialog(null,"el costo diario del queso fresco fue $" +Vtotaldiario1 +"\n" +"el costo unitario del queso fresco fue $" +Vtotalunitario1 +"\n "+"el costo mensual del queso fresco fue $" +Vtotalmensual1 +"\n"+"\nel costo diario del queso oaxaca fue $" +Vtotaldiario2 +" \n" +"el costo unitario del queso oaxaca fue $"  +Vtotalunitario2 +"\n" +"el costo mensual del queso fresco fue $" +Vtotalmensual2 +"\n"+"\nel costo diario de los chongos fue $" +Vtotaldiario3 +"\n" +"el costo unitario de los chongos fue $"  +Vtotalunitario3 +"\n" +"el costo mensual de  los chongos fue $" +Vtotalmensual3 +"\n"   + "\n \n \n El total de los costos fue de $" +Vresfinal);
            
          /* ESTE METODO ME PERMITE AGREGARLO A UNA CAJA CON SCROLL

           JTextArea msg= new JTextArea("el costo diario del queso fresco fue $" +Vtotaldiario1 +"\n" +"el costo unitario del queso fresco fue $" +Vtotalunitario1 +"\n "+"el costo mensual del queso fresco fue $" +Vtotalmensual1 +"\n"
                                                                                +"\nel costo diario del queso oaxaca fue $" +Vtotaldiario2 +" \n" +"el costo unitario del queso oaxaca fue $"  +Vtotalunitario2 +"\n" +"el costo mensual del queso fresco fue $" +Vtotalmensual2 +"\n"
                                                                                +"\nel costo diario de los chongos fue $" +Vtotaldiario3 +"\n" +"el costo unitario de los chongos fue $"  +Vtotalunitario3 +"\n" +"el costo mensual de  los chongos fue $" +Vtotalmensual3 +"\n"   
                                                                                + "\n \n \n El total de los costos fue de $" +Vresfinal);    
           msg.setLineWrap(true);
            msg.setWrapStyleWord(true);
            JScrollPane scrollPane = new JScrollPane(msg);
            JOptionPane.showMessageDialog(null, scrollPane);*/
            
            cajamateria.setText("");
            cajamano.setText("");
            cajacodir.setText("");
            cajacoind.setText("");
            cajadias.setText("");
            ck1.setText("");
                    
            cajamateria2.setText("");
            cajamano2.setText("");
            cajacodir2.setText("");
            cajacoind2.setText("");
            cajadias2.setText("");
            ck2.setText("");
                    
            cajamateria3.setText("");
            cajamano3.setText("");
            cajacodir3.setText("");
            cajacoind3.setText("");
            cajadias3.setText("");
            ck3.setText("");
        }
        
    }




}


/*  EJEMPLO


 @Override
    public void actionPerformed(ActionEvent e) {
       Calculadora calcu = new Calculadora();
        
        double n1, n2;
        
        if(e.getSource() == suma)
	{
            n1 = Integer.parseInt(caja.getText());
            n2 = Integer.parseInt(caja2.getText());
            resul.setText(Double.toString(calcu.suma(n1, n2)));
        }

*/