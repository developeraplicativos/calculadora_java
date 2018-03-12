/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;


/**
 *
 * @author Super H
 */
public class NewJFrame extends javax.swing.JFrame {
   // int clique;
    int resultado =0;
    String number = "";
    String number1 = "";
    String tipo = "";
    String textoPainel;
    //int resultado = 0;
    List lista;
    List nova;


    
    public NewJFrame() {

        
        
        lista = new ArrayList();
        initComponents();
        setLocationRelativeTo(null);//set Location Relative To(null);
        String caminho = "calc.png";
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(caminho)));
        
    }
    
    public void atualizaText(){
        text.setText(number);
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JFormattedTextField();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        butPonto = new javax.swing.JButton();
        butVir = new javax.swing.JButton();
        butSoma = new javax.swing.JButton();
        butMultiplicar = new javax.swing.JButton();
        butDividir = new javax.swing.JButton();
        butSubtrair = new javax.swing.JButton();
        butVolta = new javax.swing.JButton();
        butLimpa = new javax.swing.JButton();
        butIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calc / Emerson");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        butPonto.setText(".");
        butPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPontoActionPerformed(evt);
            }
        });

        butVir.setText(",");
        butVir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVirActionPerformed(evt);
            }
        });

        butSoma.setText("+");
        butSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSomaActionPerformed(evt);
            }
        });

        butMultiplicar.setText("*");
        butMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMultiplicarActionPerformed(evt);
            }
        });

        butDividir.setText("/");
        butDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDividirActionPerformed(evt);
            }
        });

        butSubtrair.setText("-");
        butSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSubtrairActionPerformed(evt);
            }
        });

        butVolta.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        butVolta.setText(" CE");
        butVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVoltaActionPerformed(evt);
            }
        });

        butLimpa.setText("C");
        butLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimpaActionPerformed(evt);
            }
        });

        butIgual.setText("=");
        butIgual.setBorder(null);
        butIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(butVir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butDividir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butLimpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butVolta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num1)
                            .addComponent(num2)
                            .addComponent(num3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num4)
                            .addComponent(num5)
                            .addComponent(num6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num7)
                            .addComponent(num8)
                            .addComponent(num9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butPonto)
                            .addComponent(num0)
                            .addComponent(butVir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butVolta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(butSubtrair))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(butLimpa)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butDividir)
                                .addGap(18, 18, 18)
                                .addComponent(butMultiplicar))
                            .addComponent(butIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        //this.number += "1"; 
        String t = this.text.getText();
        t += "1";
        this.text.setText(t);
        //this.atualizaText();

    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
       /* this.number += "2";  
        //this.number1 += "2";  
        this.atualizaText(); */
               String t = this.text.getText();
        t += "2";
        this.text.setText(t);
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
       /* this.number += "3";  
       //this.number1 += "3";
        this.atualizaText();*/
               String t = this.text.getText();
        t += "3";
        this.text.setText(t);
    }//GEN-LAST:event_num3ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
      /*  this.number += "9";
        //this.number1 += "9";
        this.atualizaText();*/
              String t = this.text.getText();
        t += "9";
        this.text.setText(t);
    }//GEN-LAST:event_num9ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
       /* this.number += "4";
        //this.number1 += "4";
        this.atualizaText();*/
               String t = this.text.getText();
        t += "4";
        this.text.setText(t);
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
       /* this.number += "5";
        //this.number1 += "5";
        this.atualizaText();*/
               String t = this.text.getText();
        t += "5";
        this.text.setText(t);
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
      /*  this.number += "6";
        //this.number1 += "6";
        this.atualizaText();*/
              String t = this.text.getText();
        t += "6";
        this.text.setText(t);
    }//GEN-LAST:event_num6ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        /*this.number += "8";
        //this.number1 += "8";
        this.atualizaText();*/
                String t = this.text.getText();
        t += "8";
        this.text.setText(t);
    }//GEN-LAST:event_num8ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        /*this.number += "7";  
        //this.number1 += "7";
        this.atualizaText();*/
                String t = this.text.getText();
        t += "7";
        this.text.setText(t);
    }//GEN-LAST:event_num7ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        /*this.number += "0"; 
        //this.number1 += "0";
        this.atualizaText();*/
                String t = this.text.getText();
        t += "0";
        this.text.setText(t);
    }//GEN-LAST:event_num0ActionPerformed

    private void butPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPontoActionPerformed
        this.number += ".";
        //this.tipo = "soma";
        this.atualizaText();
    }//GEN-LAST:event_butPontoActionPerformed

    private void butVirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVirActionPerformed
        this.number += ",";
        //this.tipo = "soma";
        this.atualizaText();
    }//GEN-LAST:event_butVirActionPerformed

    private void butSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSomaActionPerformed
        //this.lista.add(//this.number1);
        //this.number1 = "";
        /*
        this.number += " + ";
        //this.tipos.add("soma");
        this.atualizaText();*/
        //System.out.println(this.tipo);
                String t = this.text.getText();
        t += " + ";
        this.text.setText(t);
    }//GEN-LAST:event_butSomaActionPerformed

    private void butMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMultiplicarActionPerformed
        //this.lista.add(//this.number1);
        //this.tipos. = "mult";
        /*this.number += " * ";
        //this.tipos.add("soma");
        this.atualizaText();*/
                String t = this.text.getText();
        t += " * ";
        this.text.setText(t);
    }//GEN-LAST:event_butMultiplicarActionPerformed

    private void butDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDividirActionPerformed
        //this.lista.add(//this.number1);
        //this.tipo = "div";
       /* this.number += " / ";
        //this.tipos.add("soma");
        this.atualizaText();// TODO add your handling code here:
        */
               String t = this.text.getText();
        t += " / ";
        this.text.setText(t);
    }//GEN-LAST:event_butDividirActionPerformed

    private void butSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSubtrairActionPerformed

             String t = this.text.getText();
        t += " - ";
        this.text.setText(t);
    }//GEN-LAST:event_butSubtrairActionPerformed

    private void butVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVoltaActionPerformed
        int tamanhoEscrita = text.getText().length();
        //System.out.println(tamanhoEscrita);
        char fimm = text.getText().charAt(tamanhoEscrita-1);
        String valores = text.getText();
        //System.out.println(fimm);
        //clique ++;
        if( text.getText().length() > 0){
            //System.out.println(fimm);
            if(fimm == ' '){               
                text.setText(valores.substring(0, tamanhoEscrita-2));
            }else{
                text.setText(valores.substring(0, tamanhoEscrita-1));
            }
        }     
    }//GEN-LAST:event_butVoltaActionPerformed

    private void butLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimpaActionPerformed
        text.setText("");
    }//GEN-LAST:event_butLimpaActionPerformed

    private void butIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butIgualActionPerformed
       //this.textoPainel = this.number;
       this.textoPainel = text.getText();

        String b = this.textoPainel;

        String[] b1 = this.textoPainel.split(" ");
        boolean agora = false;
        int n1;
        int n2;
        int respostaN;
        String calculoResposta;
     //   this.nova = new ArrayList();
        String a[] = b1;
        String novaString;
        int inicio;
        int fim;
        String textOn;
        String textOff;
            
            
            
        while(b.contains("*") || b.contains("/")){
            for(int w=0; w < a.length; w++){
                String resp1 = a[w];

                switch (resp1){
                    case "*":
                        n1 = Integer.parseInt(a[w-1]);
                        n2 = Integer.parseInt(a[w+1]);
                        respostaN = n1 * n2;
                        calculoResposta = Integer.toString(respostaN);

                        novaString = ""+n1+" * "+n2+"";

                        inicio = b.indexOf(novaString);
                        fim = inicio + novaString.length();

                        textOn = b.substring(0,fim);
                        textOff = b.substring(fim, b.length());
                        textOn = textOn.replace(novaString, calculoResposta);
                        b = textOn + textOff;
                        a = b.split(" ");
                        break;
                    case "/":
                        n1 = Integer.parseInt(a[w-1]);
                        n2 = Integer.parseInt(a[w+1]);
                        respostaN = n1 / n2;
                        calculoResposta = Integer.toString(respostaN);

                        novaString = ""+n1+" / "+n2+"";

                        inicio = b.indexOf(novaString);
                        fim = inicio + novaString.length();

                        textOn = b.substring(0,fim);
                        textOff = b.substring(fim, b.length());
                        textOn = textOn.replace(novaString, calculoResposta);
                        b = textOn + textOff;
                        a = b.split(" ");
                        break;

                }

            }
        } 
         while(a.length > 1){
             
                for(int e=0; e < a.length; e++){

                    String resp = a[e];

                        switch (resp){
                        case "+":

                            n1 = Integer.parseInt(a[e-1]);
                            n2 = Integer.parseInt(a[e+1]);
                            respostaN = n1 + n2;
                            calculoResposta = Integer.toString(respostaN);

                            novaString = ""+n1+" + "+n2+"";

                            inicio = b.indexOf(novaString);
                            fim = inicio + novaString.length();

                            textOn = b.substring(0,fim);
                            textOff = b.substring(fim, b.length());
                            textOn = textOn.replace(novaString, calculoResposta);
                            b = textOn + textOff;
                            a = b.split(" ");

                            break;

                                
                        case "-":

                            n1 = Integer.parseInt(a[e-1]);
                            n2 = Integer.parseInt(a[e+1]);
                            respostaN = n1 - n2;
                            calculoResposta = Integer.toString(respostaN);

                            novaString = ""+n1+" - "+n2+"";

                            inicio = b.indexOf(novaString);
                            fim = inicio + novaString.length();

                            textOn = b.substring(0,fim);
                            textOff = b.substring(fim, b.length());
                            textOn = textOn.replace(novaString, calculoResposta);
                            b = textOn + textOff;
                            a = b.split(" ");

                            break;
                        }

                }

         }
      
         text.setText(a[0]);

    }//GEN-LAST:event_butIgualActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                 new NewJFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butDividir;
    private javax.swing.JButton butIgual;
    private javax.swing.JButton butLimpa;
    private javax.swing.JButton butMultiplicar;
    private javax.swing.JButton butPonto;
    private javax.swing.JButton butSoma;
    private javax.swing.JButton butSubtrair;
    private javax.swing.JButton butVir;
    private javax.swing.JButton butVolta;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JFormattedTextField text;
    // End of variables declaration//GEN-END:variables
}
