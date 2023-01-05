package clothes.shop.ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPerfil extends JFrame{

    private static final long serialVersionUID = 1L;
    public VentanaPerfil() {
   	 //VISUAL
   	 JPanel Datos = new JPanel();
   		 //TODO:Seguir la sesión (Quien es el usuario al venir a esta ventana) (comunicación entre ventanas) mediante pseudo-cookies
   		 Datos.setLayout(new BoxLayout(Datos, BoxLayout.Y_AXIS));
   		 Datos.add(new JLabel("Nombre:"));
   		 //TODO:Rellenar datos con la base de datos (if...)
   		 String nombreBaseDatos = "Nombre no figura en la base de datos";
   		 JLabel Nombre = new JLabel(nombreBaseDatos);
   		 Nombre.setForeground(Color.RED);
   		 Datos.add(Nombre);
   		 Datos.add(new JLabel("DNI/ID:"));
   		 //TODO:Rellenar datos con la base de datos (if...)
   		 String IDBaseDatos = "ID no figura en la base de datos";
   		 JLabel ID = new JLabel(IDBaseDatos);
   		 ID.setForeground(Color.RED);
   		 Datos.add(ID);
   		 Datos.add(new JLabel("Correo:"));
   		 //TODO:Rellenar datos con la base de datos (if...)
   		 String correoBaseDatos = "Correo no figura en la base de datos";
   		 JLabel Correo = new JLabel(correoBaseDatos);
   		 Correo.setForeground(Color.RED);
   		 Datos.add(Correo);
   	 
   	 JPanel FotoUsuario = new JPanel();
   		 JLabel imagen = new JLabel();
   		 imagen.setIcon(new ImageIcon("foto/fotoPerfilPredeterminada.jpg"));
   		 imagen.setPreferredSize(new Dimension( 200, 200 ));
   		 FotoUsuario.add( imagen );
   	 
   	 JPanel ParteSuperior = new JPanel();
   		 //TODO:ANYADIR LOGO
   		 ParteSuperior.setLayout(new BorderLayout());
   		 JButton hBoton = new JButton("←");
   		 hBoton.setPreferredSize(new Dimension(44, 20));
   		 ParteSuperior.add(hBoton, BorderLayout.WEST);
   		 
     Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
   	 
   	 Datos.setBorder(BorderFactory.createEmptyBorder(250,100,500,100));
   	 FotoUsuario.setBorder(BorderFactory.createEmptyBorder(200,50,0,0));
   	 ParteSuperior.setBorder(BorderFactory.createEmptyBorder(20,20,0,20));
   	 
   	 Container contentPane = getContentPane();
   	 contentPane.add(Datos, BorderLayout.CENTER);
   	 contentPane.add(FotoUsuario, BorderLayout.WEST);
   	 contentPane.add(ParteSuperior, BorderLayout.NORTH);
    
   	 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   	 setSize(1000, 800);
   	 int x = (int) ((dimension.getWidth() - getWidth()) / 2);
   	 int y = (int) ((dimension.getHeight() - getHeight()) / 2);
   	 setLocation(x, y);
   	 setTitle("Perfil");
   	 setVisible(true);
   	 
   	 //FUNCIONALIDAD
   	 hBoton.addActionListener(new ActionListener() {    
   		 @Override
   		 public void actionPerformed(ActionEvent e) {
   			 //TODO:Seguir la sesión (Quien es el usuario al mandarle a la otra ventana) (comunicación entre ventanas) mediante pseudo-cookies
   			 VentanaPerfil.this.dispose();
   			 VentanaPrincipal l = new VentanaPrincipal();
   		 }
   	 });
    }
}
