package musicwidget;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import java.io.IOException;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;

public class version_w {
	
	private static String songtrackone, songtracktwo, songtrackthree, songtrackfour, songtrackfive, songtracksix;
	private static songsevents se = new songsevents();
	private static boolean flag = false;
	
	
	private static void widgetcomponents() {
		Display display = Display.getDefault();
		
		Shell shlIremia = new Shell();
		shlIremia.setMaximumSize(new Point(370, 350));
		shlIremia.setMinimumSize(new Point(370, 350));
		shlIremia.setImage(SWTResourceManager.getImage(version_w.class, "/icons/music.png"));
		shlIremia.setSize(370, 350);
		shlIremia.setText("IREMIA");
		shlIremia.setLocation(800, 300);
		
		//adding audio files
		songtrackone = "C:\\Users\\Vaishnavi\\eclipse-workspace\\musicwidget\\src\\musicwidget\\songfiles\\Rain.wav";		
		songtracktwo = "C:\\Users\\Vaishnavi\\eclipse-workspace\\musicwidget\\src\\musicwidget\\songfiles\\Beautiful-Piano.wav";
		songtrackthree = "C:\\Users\\Vaishnavi\\eclipse-workspace\\musicwidget\\src\\musicwidget\\songfiles\\burghrecords__birds-singing-forest-scotland.wav";
		songtrackfour = "C:\\Users\\Vaishnavi\\eclipse-workspace\\musicwidget\\src\\musicwidget\\songfiles\\Inspiring-Acoustic-Guitar.wav";
		songtrackfive = "C:\\Users\\Vaishnavi\\eclipse-workspace\\musicwidget\\src\\musicwidget\\songfiles\\nervousneal__morning-surf-at-boracay-philippines.wav";
		songtracksix = "C:\\Users\\Vaishnavi\\eclipse-workspace\\musicwidget\\src\\musicwidget\\songfiles\\Still-Awake-Lofi-Study-Music.wav";
		
		
		Button songfive = new Button(shlIremia, SWT.NONE);
		songfive.setImage(SWTResourceManager.getImage(version_w.class, "/icons/wave.png"));
		songfive.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(flag == true) {
					se.setSongFile(null);
					try {
						se.stop();
					}
					catch(IOException exp) {
						exp.printStackTrace();
					}
					
					se.setSongFile(songtrackfive);
					se.play();
					
				}
				else {
				se.setSongFile(songtrackfive);
				se.play();
				flag = true;
				}
			}
		});
		songfive.setBounds(136, 133, 76, 79);
		
		
		Button stopbutton = new Button(shlIremia, SWT.NONE);
		stopbutton.setImage(SWTResourceManager.getImage(version_w.class, "/icons/stop-button.png"));
		stopbutton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				se.setSongFile(null);
				try {
					se.stop();
				}
				catch(IOException exp) {
					exp.printStackTrace();
				}
			}
		});
		stopbutton.setBounds(145, 239, 49, 51);
		
		
		Button songthree = new Button(shlIremia, SWT.NONE);
		songthree.setImage(SWTResourceManager.getImage(version_w.class, "/icons/nature.png"));
		songthree.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(flag == true) {
					se.setSongFile(null);
					try {
						se.stop();
					}
					catch(IOException exp) {
						exp.printStackTrace();
					}
					
					se.setSongFile(songtrackthree);
					se.play();
					
				}
				else {
				se.setSongFile(songtrackthree);
				se.play();
				flag = true;
				}
			}
		});
		songthree.setBounds(258, 20, 76, 79);
		
		
		Button songtwo = new Button(shlIremia, SWT.NONE);
		songtwo.setImage(SWTResourceManager.getImage(version_w.class, "/icons/piano.png"));
		songtwo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(flag == true) {
					se.setSongFile(null);
					try {
						se.stop();
					}
					catch(IOException exp) {
						exp.printStackTrace();
					}
					
					se.setSongFile(songtracktwo);
					se.play();
					
				}
				else {
				se.setSongFile(songtracktwo);
				se.play();
				flag = true;
				}

			}
		});
		songtwo.setBounds(136, 20, 76, 79);
		
		
		Button songfour = new Button(shlIremia, SWT.NONE);
		songfour.setImage(SWTResourceManager.getImage(version_w.class, "/icons/guitar.png"));
		songfour.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(flag == true) {
					se.setSongFile(null);
					try {
						se.stop();
					}
					catch(IOException exp) {
						exp.printStackTrace();
					}
					
					se.setSongFile(songtrackfour);
					se.play();
					
				}
				else {
				se.setSongFile(songtrackfour);
				se.play();
				flag = true;
				}
			}
		});
		songfour.setBounds(10, 133, 76, 79);
		
		
		Button songsix = new Button(shlIremia, SWT.NONE);
		songsix.setImage(SWTResourceManager.getImage(version_w.class, "/icons/studying.png"));
		songsix.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(flag == true) {
					se.setSongFile(null);
					try {
						se.stop();
					}
					catch(IOException exp) {
						exp.printStackTrace();
					}
					
					se.setSongFile(songtracksix);
					se.play();
					
				}
				else {
				se.setSongFile(songtracksix);
				se.play();
				flag = true;
				}
			}
		});
		songsix.setBounds(258, 133, 76, 79);
		
		
		Button songone = new Button(shlIremia, SWT.NONE);
		songone.setImage(SWTResourceManager.getImage(version_w.class, "/icons/rain.png"));
		songone.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(flag == true) {
					se.setSongFile(null);
					try {
						se.stop();
					}
					catch(IOException exp) {
						exp.printStackTrace();
					}
					
					se.setSongFile(songtrackone);
					se.play();
					
				}
				else {
				se.setSongFile(songtrackone);
				se.play();
				flag = true;
				}
			}
		});
		songone.setBounds(10, 20, 76, 79);
		
		Label lblNewLabel = new Label(shlIremia, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage(version_w.class, "/icons/vecteezy_small-hexagon-shape-with-light-white-and-grey-color-seamless_6941002.jpg"));
		lblNewLabel.setBackground(SWTResourceManager.getColor(255, 255, 204));
		lblNewLabel.setBounds(0, 0, 351, 305);
		shlIremia.setTabList(new Control[]{songfive, stopbutton, songthree, songtwo, songfour, songsix, songone, lblNewLabel});
		
		
		shlIremia.open();
		shlIremia.layout();
		while (!shlIremia.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public static void main(String[] args) {
		widgetcomponents();
	}
}
