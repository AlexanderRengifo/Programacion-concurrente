package practica6.src.practica6;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class registro extends JPanel {
	private estudiantes hilo1,hilo2,hilo3,hilo4,hilo5;
	private estudiantes es;
	private JTable docente1;
	private JTable docente2;
	private JTable docente3;
	private JTable docente5;
	private JTable docente4;
	DefaultTableModel model,model2,model3,model4,model5;
	public JLabel lbl_promtotalD1;
	public JLabel lbl_porc_AD1;
	public JLabel lbl_porc_SD1;
	public JLabel lbl_porc_RD1;
	public JLabel lbl_promtotalD2;
	public JLabel lbl_porc_AD2;
	public JLabel lbl_porc_SD2;
	public JLabel lbl_porc_RD2;
	public JLabel lbl_promtotalD3;
	public JLabel lbl_porc_AD3;
	public JLabel lbl_porc_SD3;
	public JLabel lbl_porc_RD3;
	public JLabel lbl_promtotalD4;
	public JLabel lbl_porc_AD4;
	public JLabel lbl_porc_SD4;
	public JLabel lbl_porc_RD4;
	public JLabel lbl_promtotalD5;
	public JLabel lbl_porc_AD5;
	public JLabel lbl_porc_SD5;
	public JLabel lbl_porc_RD5;
	

	/**
	 * Create the panel.
	 */
	public registro() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 1070, 147);
		add(scrollPane);
		
		docente1 = new JTable();
		model=new DefaultTableModel();
		Object [] columna= {"ESTUDIANTE","N1","N2","N3","N4","N5","N6","N7","N8","N9","N10","PROMEDIO","CRITERIOS"};
		//Object [] fila= new  Object[12];
		model.setColumnIdentifiers(columna);
		docente1.setModel(model);
		scrollPane.setViewportView(docente1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 167, 1070, 147);
		add(scrollPane_1);
		
		docente2 = new JTable();
		model2=new DefaultTableModel();
		//Object [] columna= {"ESTUDIANTE","N1","N2","N3","N4","N5","N6","N7","N8","N9","N10","PROMEDIO","CRITERIOS"};
		//Object [] fila= new  Object[0];
		model2.setColumnIdentifiers(columna);
		docente2.setModel(model2);
		scrollPane_1.setViewportView(docente2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 324, 1070, 147);
		add(scrollPane_2);
		
		docente3 = new JTable();
		model3=new DefaultTableModel();
		model3.setColumnIdentifiers(columna);
		docente3.setModel(model3);
		scrollPane_2.setViewportView(docente3);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 481, 1070, 147);
		add(scrollPane_3);
		
		docente4 = new JTable();
		model4=new DefaultTableModel();
		model4.setColumnIdentifiers(columna);
		docente4.setModel(model4);
		scrollPane_3.setViewportView(docente4);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 637, 1070, 147);
		add(scrollPane_4);
		
		docente5 = new JTable();
		model5=new DefaultTableModel();
		model5.setColumnIdentifiers(columna);
		docente5.setModel(model5);
		scrollPane_4.setViewportView(docente5);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(1104, 10, 277, 147);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("Promedio total:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(0, 10, 121, 26);
		panel.add(lblNewLabel);
		
		JLabel lblAprobados = new JLabel("% APROBADOS");
		lblAprobados.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAprobados.setBounds(0, 46, 121, 26);
		panel.add(lblAprobados);
		
		JLabel lblSuspensos = new JLabel("% SUSPENSOS");
		lblSuspensos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSuspensos.setBounds(0, 74, 121, 26);
		panel.add(lblSuspensos);
		
		JLabel lblReprobados = new JLabel("% REPROBADOS");
		lblReprobados.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblReprobados.setBounds(0, 99, 121, 26);
		panel.add(lblReprobados);
		
		lbl_promtotalD1 = new JLabel("----");
		lbl_promtotalD1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_promtotalD1.setBounds(146, 10, 82, 26);
		panel.add(lbl_promtotalD1);
		
		lbl_porc_AD1 = new JLabel("----");
		lbl_porc_AD1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_AD1.setBounds(146, 46, 82, 26);
		panel.add(lbl_porc_AD1);
		
		lbl_porc_SD1 = new JLabel("----");
		lbl_porc_SD1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_SD1.setBounds(146, 74, 82, 26);
		panel.add(lbl_porc_SD1);
		
		lbl_porc_RD1 = new JLabel("----");
		lbl_porc_RD1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_RD1.setBounds(146, 99, 82, 26);
		panel.add(lbl_porc_RD1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(1104, 167, 277, 147);
		add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Promedio total:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(0, 10, 121, 26);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblAprobados_1 = new JLabel("% APROBADOS");
		lblAprobados_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAprobados_1.setBounds(0, 46, 121, 26);
		panel_1.add(lblAprobados_1);
		
		JLabel lblSuspensos_1 = new JLabel("% SUSPENSOS");
		lblSuspensos_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSuspensos_1.setBounds(0, 74, 121, 26);
		panel_1.add(lblSuspensos_1);
		
		JLabel lblReprobados_1 = new JLabel("% REPROBADOS");
		lblReprobados_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblReprobados_1.setBounds(0, 99, 121, 26);
		panel_1.add(lblReprobados_1);
		
		lbl_promtotalD2 = new JLabel("----");
		lbl_promtotalD2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_promtotalD2.setBounds(146, 10, 82, 26);
		panel_1.add(lbl_promtotalD2);
		
		lbl_porc_AD2 = new JLabel("----");
		lbl_porc_AD2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_AD2.setBounds(146, 46, 82, 26);
		panel_1.add(lbl_porc_AD2);
		
		lbl_porc_SD2 = new JLabel("----");
		lbl_porc_SD2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_SD2.setBounds(146, 74, 82, 26);
		panel_1.add(lbl_porc_SD2);
		
		lbl_porc_RD2 = new JLabel("----");
		lbl_porc_RD2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_RD2.setBounds(146, 99, 82, 26);
		panel_1.add(lbl_porc_RD2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(1104, 324, 277, 147);
		add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Promedio total:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(0, 10, 121, 26);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblAprobados_2 = new JLabel("% APROBADOS");
		lblAprobados_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAprobados_2.setBounds(0, 46, 121, 26);
		panel_2.add(lblAprobados_2);
		
		JLabel lblSuspensos_2 = new JLabel("% SUSPENSOS");
		lblSuspensos_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSuspensos_2.setBounds(0, 74, 121, 26);
		panel_2.add(lblSuspensos_2);
		
		JLabel lblReprobados_2 = new JLabel("% REPROBADOS");
		lblReprobados_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblReprobados_2.setBounds(0, 99, 121, 26);
		panel_2.add(lblReprobados_2);
		
		lbl_promtotalD3 = new JLabel("----");
		lbl_promtotalD3.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_promtotalD3.setBounds(146, 10, 82, 26);
		panel_2.add(lbl_promtotalD3);
		
		lbl_porc_AD3 = new JLabel("----");
		lbl_porc_AD3.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_AD3.setBounds(146, 46, 82, 26);
		panel_2.add(lbl_porc_AD3);
		
		lbl_porc_SD3 = new JLabel("----");
		lbl_porc_SD3.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_SD3.setBounds(146, 74, 82, 26);
		panel_2.add(lbl_porc_SD3);
		
		lbl_porc_RD3 = new JLabel("----");
		lbl_porc_RD3.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_RD3.setBounds(146, 99, 82, 26);
		panel_2.add(lbl_porc_RD3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(1104, 481, 277, 147);
		add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("Promedio total:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_3.setBounds(0, 10, 121, 26);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblAprobados_3 = new JLabel("% APROBADOS");
		lblAprobados_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAprobados_3.setBounds(0, 46, 121, 26);
		panel_3.add(lblAprobados_3);
		
		JLabel lblSuspensos_3 = new JLabel("% SUSPENSOS");
		lblSuspensos_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSuspensos_3.setBounds(0, 74, 121, 26);
		panel_3.add(lblSuspensos_3);
		
		JLabel lblReprobados_3 = new JLabel("% REPROBADOS");
		lblReprobados_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblReprobados_3.setBounds(0, 99, 121, 26);
		panel_3.add(lblReprobados_3);
		
		lbl_promtotalD4 = new JLabel("----");
		lbl_promtotalD4.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_promtotalD4.setBounds(146, 10, 82, 26);
		panel_3.add(lbl_promtotalD4);
		
		lbl_porc_AD4 = new JLabel("----");
		lbl_porc_AD4.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_AD4.setBounds(146, 46, 82, 26);
		panel_3.add(lbl_porc_AD4);
		
		lbl_porc_SD4 = new JLabel("----");
		lbl_porc_SD4.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_SD4.setBounds(146, 74, 82, 26);
		panel_3.add(lbl_porc_SD4);
		
		lbl_porc_RD4 = new JLabel("----");
		lbl_porc_RD4.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_RD4.setBounds(146, 99, 82, 26);
		panel_3.add(lbl_porc_RD4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(1104, 637, 277, 147);
		add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("Promedio total:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_4.setBounds(0, 10, 121, 26);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblAprobados_4 = new JLabel("% APROBADOS");
		lblAprobados_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAprobados_4.setBounds(0, 46, 121, 26);
		panel_4.add(lblAprobados_4);
		
		JLabel lblSuspensos_4 = new JLabel("% SUSPENSOS");
		lblSuspensos_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSuspensos_4.setBounds(0, 74, 121, 26);
		panel_4.add(lblSuspensos_4);
		
		JLabel lblReprobados_4 = new JLabel("% REPROBADOS");
		lblReprobados_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblReprobados_4.setBounds(0, 99, 121, 26);
		panel_4.add(lblReprobados_4);
		
		lbl_promtotalD5 = new JLabel("----");
		lbl_promtotalD5.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_promtotalD5.setBounds(146, 10, 82, 26);
		panel_4.add(lbl_promtotalD5);
		
		lbl_porc_AD5 = new JLabel("----");
		lbl_porc_AD5.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_AD5.setBounds(146, 46, 82, 26);
		panel_4.add(lbl_porc_AD5);
		
		lbl_porc_SD5 = new JLabel("----");
		lbl_porc_SD5.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_SD5.setBounds(146, 74, 82, 26);
		panel_4.add(lbl_porc_SD5);
		
		lbl_porc_RD5 = new JLabel("----");
		lbl_porc_RD5.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lbl_porc_RD5.setBounds(146, 99, 82, 26);
		panel_4.add(lbl_porc_RD5);
		
		JButton btn_iniciar = new JButton("INICIAR");
		btn_iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hilo1.start();
				hilo2.start();
				hilo3.start();
				hilo4.start();
				hilo5.start();
			}
		});
		btn_iniciar.setBackground(Color.RED);
		btn_iniciar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btn_iniciar.setBounds(1391, 8, 139, 60);
		add(btn_iniciar);
		
		hilo1=new estudiantes(this, "docente1");
		hilo2=new estudiantes(this, "docente2");
		hilo3=new estudiantes(this, "docente3");
		hilo4=new estudiantes(this, "docente4");
		hilo5=new estudiantes(this, "docente5");

	}
}
