package crearExamenPack;

import javax.swing.*;
import java.awt.*;

public class createPanel extends JPanel {
    createPanel(){
    }
    public void addSideText(String content,int x, int y, int w, int h){
        JLabel cont = new JLabel(content);
        cont.setBounds(x,y, w, h);
        cont.setForeground(Color.BLACK);
        cont.setBackground(Color.lightGray);
        cont.setFont(new Font("MyriadPro", Font.PLAIN, 13));
        this.add(cont);
    }
    public void addTextBox(JTextField campo,int x, int y, int w, int h){
        campo.setBounds(x, y, w, h);
    }
    public void addComboBox(JComboBox lista,int x,int y, int w, int h){
        lista.setBounds(x, y, w, h);
    }
    public void addTextArea(JTextArea campo,int x, int y, int w, int h,boolean b){
        campo.setBounds(x,y,w,h);
        campo.setEditable(b);
        campo.setFont(new Font("MyriadPro",Font.BOLD, 14));
    }
    Color Fondo = new Color(238,237,238);
    public void addTitulo(String Contenido,int x,int y,int w,int h,int s){
        JLabel titulo = new JLabel(Contenido, SwingConstants.LEFT);
        titulo.setOpaque(true);
        this.add(titulo);
        titulo.setBounds(x,y, w, h);
        titulo.setForeground(Color.BLACK);
        titulo.setBackground(Fondo);
        titulo.setFont(new Font("Roboto Black", Font.PLAIN, s));
    }
    public void addFrameInfo(String Contenido,int x,int y,int w,int h){
        JLabel Info= new JLabel(Contenido);
        Info.setBounds(x,y,w,h);
        Info.setForeground(Color.BLACK);
        Info.setFont(new Font("MyruadPro",Font.BOLD,13));
        this.add(Info);

    }
}
