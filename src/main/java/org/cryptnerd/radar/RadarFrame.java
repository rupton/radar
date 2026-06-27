package org.cryptnerd.radar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Frame;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class RadarFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtScope;
	private final String THEATERSCOPE = "Theater";
	private final String SHIPBOARDSCOPE = "Ship";
	private final String AIRNET = "Airnetwork";
	private final String SAT = "Satellite";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadarFrame frame = new RadarFrame();
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
	public RadarFrame() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("RADAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel,BorderLayout.CENTER);
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblScopeLabel = new JLabel("Scope:");
		mainPanel.add(lblScopeLabel);
		lblScopeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtScope = new JTextField();
		mainPanel.add(txtScope);
		txtScope.setColumns(10);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSensorMenu = new JMenu("Sources");
		mnSensorMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnSensorMenu);
		
		JMenuItem mntmTheater = new JMenuItem("Theater");
		mntmTheater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Selected Theater Scope");
				txtScope.setText(THEATERSCOPE);
			}
		});
		mntmTheater.setFont(new Font("Segoe UI", Font.PLAIN, 16));

		mnSensorMenu.add(mntmTheater);
		
		JMenuItem mntmShipboard = new JMenuItem("Shipboard");
		mntmShipboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScope.setText(SHIPBOARDSCOPE);
			}
		});
		mntmShipboard.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnSensorMenu.add(mntmShipboard);
		
		JMenuItem mntmSatellite = new JMenuItem("Satellite");
		mntmSatellite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScope.setText(SAT);
			}
		});
		mntmSatellite.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnSensorMenu.add(mntmSatellite);
		
		JMenuItem mntmAirnet = new JMenuItem("Air Net");
		mntmAirnet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScope.setText(AIRNET);
			}
		});
		mntmAirnet.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnSensorMenu.add(mntmAirnet);

	}

}
