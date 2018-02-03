package des176_SpotifyKnockoff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class SpotifyGUI {

	private JFrame frame;
	private JTable tblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpotifyGUI window = new SpotifyGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SpotifyGUI() {
		initialize();
		getSongData();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Spotify");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblViewSelector = new JLabel("Select View");
		lblViewSelector.setBounds(10, 23, 63, 14);
		frame.getContentPane().add(lblViewSelector);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show Albums");
		rdbtnNewRadioButton.setBounds(20, 43, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		tblData = new JTable();
		tblData.setBounds(172, 43, 214, 132);
		frame.getContentPane().add(tblData);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private DefaultTableModel getSongData() {
		String sql = "SELECT song_id, title, length, release_date, record_date FROM songs;";
		
		try {
			DbUtilities db = new DbUtilities();
			int x = 10;
			int y = 0;
			x = x/y;
		} catch (Exception e) {
			// TODO: handle exception
			// e.printStackTrace();
			JOptionPane.showMessageDialog(frame, "Unable to connect to database");
			ErrorLogger.log(e.getMessage());
		}
		return null;
		
	}
}
