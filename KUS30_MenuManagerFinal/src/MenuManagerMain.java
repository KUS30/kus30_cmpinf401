import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
public class MenuManagerMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MenuManager menuManager;
	private DefaultListModel<Menu> listModel;
	private ArrayList<Menu> menus;
	private DetailsFrame df;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JComboBox<MenuItem> comboBox;
	private GridBagLayout gbl_panel_1;
	private GridBagConstraints gbc_lblNewLabel_1;
	private GridBagConstraints gbc_lblNewLabel_2;
	private GridBagConstraints gbc_comboBox;
	private GridBagConstraints gbc_comboBox_1;
	private GridBagConstraints gbc_lblNewLabel_3;
	private GridBagConstraints gbc_comboBox_2;
	private GridBagConstraints gbc_lblNewLabel_4;
	private GridBagConstraints gbc_comboBox_3;
	private JLabel lblNewLabel_2;
	private JComboBox<MenuItem> comboBox_1;
	private JLabel lblNewLabel_3;
	private JComboBox<MenuItem> comboBox_2;
	private JLabel lblNewLabel_4;
	private JComboBox<MenuItem> comboBox_3;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JPanel panel_3;
	private JLabel lblNewLabel_5;
	private JList<Menu> list;
	private JPanel panel_4;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuManagerMain frame = new MenuManagerMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuManagerMain() {	
		menuManager = new MenuManager("data/dishes.txt");
		menus = new ArrayList<>();
		listModel = new DefaultListModel<Menu>();
		
		setTitle("Menu Manager");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(6, 6, 248, 217);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(6, 27, 236, 152);
		panel.add(panel_1);
		gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {76, 146, 10};
		gbl_panel_1.rowHeights = new int[]{37, 37, 37, 37, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblNewLabel_1 = new JLabel("Entree");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		comboBox = new JComboBox<MenuItem>();
	    gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.VERTICAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		panel_1.add(comboBox, gbc_comboBox);
		
		lblNewLabel_2 = new JLabel("Side");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		comboBox_1 = new JComboBox<MenuItem>();
		gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.fill = GridBagConstraints.VERTICAL;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 1;
		panel_1.add(comboBox_1, gbc_comboBox_1);
		
		lblNewLabel_3 = new JLabel("Salad");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		comboBox_2 = new JComboBox<MenuItem>();
		gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.fill = GridBagConstraints.VERTICAL;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 2;
		panel_1.add(comboBox_2, gbc_comboBox_2);
		
		lblNewLabel_4 = new JLabel("Dessert");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		comboBox_3 = new JComboBox<MenuItem>();
		gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.fill = GridBagConstraints.VERTICAL;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 3;
		panel_1.add(comboBox_3, gbc_comboBox_3);
		
		btnNewButton = new JButton("Create Menu with these dishes");
		btnNewButton.setBounds(6, 182, 236, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entree entree = (Entree) comboBox.getSelectedItem();
				Salad salad = (Salad) comboBox_2.getSelectedItem();
				Side side = (Side) comboBox_1.getSelectedItem();
				Dessert dessert = (Dessert) comboBox_3.getSelectedItem();
				Menu newMenu = new Menu(JOptionPane.showInputDialog("What is the name of this menu?", null), entree, side, salad, dessert);
				menus.add(newMenu);
				listModel.addElement(newMenu);
			}
		});
		panel.add(btnNewButton);
		
		lblNewLabel = new JLabel("Build your own Menu");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel.setBounds(6, 6, 157, 16);
		panel.add(lblNewLabel);
		
		ArrayList<Entree> fileEntrees = menuManager.getEntrees();
		for(Entree e : fileEntrees)
			comboBox.addItem(e);
		
		ArrayList<Side> fileSides = menuManager.getSides();
		for(Side s : fileSides)
			comboBox_1.addItem(s);
		
		ArrayList<Salad> fileSalads = menuManager.getSalads();
		for(Salad s : fileSalads)
			comboBox_2.addItem(s);
		
		ArrayList<Dessert> fileDesserts = menuManager.getDesserts();
		for(Dessert d : fileDesserts)
			comboBox_3.addItem(d);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(6, 235, 248, 81);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 1, 0, 0));
		
		btnNewButton_1 = new JButton("Generate a Random Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu randMenu = menuManager.randomMenu();
				randMenu.setName(JOptionPane.showInputDialog("What is the name of this menu?", null));
				menus.add(randMenu);
				listModel.addElement(randMenu);
			}
		});
		panel_2.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Generate a Minimum Calorie Menu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu minMenu = menuManager.minCaloriesMenu();
				minMenu.setName(JOptionPane.showInputDialog("What is the name of this menu?", null));
				menus.add(minMenu);
				listModel.addElement(minMenu);
			}
		});
		panel_2.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Generate a Maximum Calorie Menu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu maxMenu = menuManager.maxCaloriesMenu();
				maxMenu.setName(JOptionPane.showInputDialog("What is the name of this menu?", null));
				menus.add(maxMenu);
				listModel.addElement(maxMenu);
			}
		});
		panel_2.add(btnNewButton_3);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(266, 6, 228, 258);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		lblNewLabel_5 = new JLabel("Created Menus:");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_5.setBounds(6, 6, 113, 16);
		panel_3.add(lblNewLabel_5);
		
		list = new JList<Menu>(listModel);
		list.setBounds(6, 21, 216, 231);
		panel_3.add(list);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(266, 276, 228, 40);
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 3, 0, 0));
		
		btnNewButton_4 = new JButton("Details");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedValue() != null) {
					if(df != null)
						df.dispose();
					Menu m = (Menu) list.getSelectedValue();
					df = new DetailsFrame(m);
					df.setVisible(true);
				}
			}
		});
		panel_4.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Delete All");
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.removeAllElements();
			}
		});
		panel_4.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Save to file");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileManager.writeMenu("data/menus.txt", menus);
			}
		});
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		panel_4.add(btnNewButton_6);
	}
	
	class DetailsFrame extends JFrame {

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextArea detailTextArea;
		private JTextArea detailTextArea_1;
		private JTextArea detailTextArea_2;
		private JTextArea detailTextArea_3;
		private JLabel detailLblNewLabel_2;
		private JLabel detailLblNewLabel_3;
		private JPanel detailsPanel_1;
		private JLabel detailLblNewLabel_4;
		private JTextArea detailTextArea_4;
		private JTextArea detailTextArea_5;
		private JLabel detailLblNewLabel_5;
		private JPanel detailsPanel;
		private JLabel detailLblNewLabel;
		private JLabel detailLblNewLabel_1;
		
		public DetailsFrame(Menu menu) {
			setTitle("Menu: " + menu.getName());
			
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			detailsPanel = new JPanel();
			detailsPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			detailsPanel.setBounds(6, 6, 438, 217);
			contentPane.add(detailsPanel);
			detailsPanel.setLayout(null);
			
			detailLblNewLabel = new JLabel("Entree");
			detailLblNewLabel.setBounds(6, 6, 114, 45);
			detailsPanel.add(detailLblNewLabel);
			
			detailTextArea = new JTextArea();
			detailTextArea.setWrapStyleWord(true);
			detailTextArea.setLineWrap(true);
			detailTextArea.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			detailTextArea.setEditable(false);
			detailTextArea.setBounds(114, 0, 318, 51);
			detailsPanel.add(detailTextArea);
			detailTextArea.append(menu.getEntree().getName() + "\n" + menu.getEntree().getDescription() + "\n" + "Calories: " + menu.getEntree().getCalories() + "     Price: $" + menu.getEntree().getPrice());
			detailTextArea.setColumns(10);
			
			detailLblNewLabel_1 = new JLabel("Side");
			detailLblNewLabel_1.setBounds(6, 57, 114, 45);
			detailsPanel.add(detailLblNewLabel_1);
			
			detailTextArea_1 = new JTextArea();
			detailTextArea_1.setWrapStyleWord(true);
			detailTextArea_1.setLineWrap(true);
			detailTextArea_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			detailTextArea_1.setEditable(false);
			detailTextArea_1.setBounds(114, 54, 318, 51);
			detailsPanel.add(detailTextArea_1);
			detailTextArea_1.append(menu.getSide().getName() + "\n" + menu.getSide().getDescription() + "\n" + "Calories: " + menu.getSide().getCalories() + "     Price: $" + menu.getSide().getPrice());
			detailTextArea_1.setColumns(10);
			
			detailTextArea_2 = new JTextArea();
			detailTextArea_2.setWrapStyleWord(true);
			detailTextArea_2.setLineWrap(true);
			detailTextArea_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			detailTextArea_2.setEditable(false);
			detailTextArea_2.setColumns(10);
			detailTextArea_2.setBounds(114, 108, 318, 51);
			detailTextArea_2.append(menu.getSalad().getName() + "\n" + menu.getSalad().getDescription() + "\n" + "Calories: " + menu.getSalad().getCalories() + "     Price: $" + menu.getSalad().getPrice());
			detailsPanel.add(detailTextArea_2);
			
			detailTextArea_3 = new JTextArea();
			detailTextArea_3.setWrapStyleWord(true);
			detailTextArea_3.setLineWrap(true);
			detailTextArea_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			detailTextArea_3.setEditable(false);
			detailTextArea_3.setColumns(10);
			detailTextArea_3.setBounds(114, 162, 318, 51);
			detailTextArea_3.append(menu.getDessert().getName() + "\n" + menu.getDessert().getDescription() + "\n" + "Calories: " + menu.getDessert().getCalories() + "     Price: $" + menu.getDessert().getPrice());
			detailsPanel.add(detailTextArea_3);
			
			detailLblNewLabel_2 = new JLabel("Salad");
			detailLblNewLabel_2.setBounds(6, 111, 114, 45);
			detailsPanel.add(detailLblNewLabel_2);
			
			detailLblNewLabel_3 = new JLabel("Dessert");
			detailLblNewLabel_3.setBounds(6, 165, 114, 45);
			detailsPanel.add(detailLblNewLabel_3);
			
			detailsPanel_1 = new JPanel();
			detailsPanel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			detailsPanel_1.setBounds(6, 235, 438, 31);
			contentPane.add(detailsPanel_1);
			detailsPanel_1.setLayout(null);
			
			detailLblNewLabel_4 = new JLabel("Calories:");
			detailLblNewLabel_4.setBounds(6, 6, 61, 16);
			detailsPanel_1.add(detailLblNewLabel_4);
			
			detailTextArea_4 = new JTextArea();
			detailTextArea_4.setEditable(false);
			detailTextArea_4.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
			detailTextArea_4.setWrapStyleWord(true);
			detailTextArea_4.setBounds(79, 1, 89, 26);
			detailsPanel_1.add(detailTextArea_4);
			detailTextArea_4.append(menu.totalCalories() + "");
			detailTextArea_4.setColumns(10);
			
			detailTextArea_5 = new JTextArea();
			detailTextArea_5.setEditable(false);
			detailTextArea_5.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
			detailTextArea_5.setWrapStyleWord(true);
			detailTextArea_5.setBounds(343, 1, 89, 26);
			detailTextArea_5.append(menu.getPrice() + "");
			detailsPanel_1.add(detailTextArea_5);
			detailTextArea_5.setColumns(10);
			
			detailLblNewLabel_5 = new JLabel("Total Price: $");
			detailLblNewLabel_5.setBounds(242, 6, 89, 16);
			detailsPanel_1.add(detailLblNewLabel_5);
		}
	}
}
