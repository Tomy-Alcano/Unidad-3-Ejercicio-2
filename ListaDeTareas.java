import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListaDeTareas {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame ventana = new JFrame("Lista de Tareas");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(600,400);
            ventana.setLocationRelativeTo(null);

            ventana.setLayout(new BorderLayout());

            JLabel lblTitulo = new JLabel("Lista de Tareas", SwingConstants.CENTER);

            DefaultListModel<String> modelo = new DefaultListModel<>();

            JList<String> lista = new JList<>(modelo);

            JScrollPane scroll = new JScrollPane(lista);

            JTextField txtTarea = new JTextField("Escriba la tarea que quiere agregar");


            JButton btnAgregar = new JButton("Agregar tarea");

            JButton btnEliminar = new JButton("Eliminar tarea seleccionada");
            btnEliminar.setEnabled(false);

            JLabel lblTotal = new JLabel("Total de tareas: 0");

            JPanel panelSuperior = new JPanel(new BorderLayout());
            panelSuperior.add(txtTarea);
            panelSuperior.add(btnAgregar, BorderLayout.EAST);

            JPanel panelInferior = new JPanel(new BorderLayout());

            panelInferior.add(btnEliminar, BorderLayout.NORTH);
            panelInferior.add(lblTotal, BorderLayout.SOUTH);

            btnAgregar.addActionListener(a -> {

                String tarea = txtTarea.getText().trim();

                if (!tarea.isEmpty()) {
                    modelo.addElement(tarea);
                    txtTarea.setText("");

                    lblTotal.setText("Total de tareas: " + modelo.getSize());
                }

                lista.addListSelectionListener(l ->{
                    if(!l.getValueIsAdjusting()){
                        btnEliminar.setEnabled(lista.getSelectedIndex() != 1);
                    }
                });

                btnEliminar.addActionListener(e -> {
                    int indice = lista.getSelectedIndex();

                    if (indice != -1) {
                        modelo.remove(indice);

                        lblTotal.setText("Total de tareas: " + modelo.getSize());

                        btnEliminar.setEnabled(false);
                    }
                });


            });
            ventana.add(lblTitulo, BorderLayout.NORTH);
            ventana.add(scroll, BorderLayout.CENTER);
            ventana.add(panelSuperior, BorderLayout.SOUTH);
            ventana.add(panelInferior, BorderLayout.EAST);

            ventana.setVisible(true);
        });

    }

}
