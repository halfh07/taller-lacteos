package contabilidad.costos.nittiotremo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.*;

public class Ventanita extends JFrame implements ActionListener
{
    float materia1,materia2,materia3,mano1,mano2,mano3,codir1,codir2,codir3,coind1,coind2,coind3,luz,agua,gas,dias1,dias2,dias3;
    float Vtotaldiario1,Vtotaldiario2,Vtoltadiario3,Vtotalmensual1,Vtotalmensual2,Vtotalmensual3,Vrestotal;

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
                          // caja.setBounds(155,50,100,25);
                           
                          
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
                          // caja.setBounds(155,50,100,25);
                           
                          
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
                          // caja.setBounds(155,50,100,25);
                           
                          
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
                         


}
 


    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
