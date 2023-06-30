package apresentação;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import controller.Casa;

public class BotaoCasa extends JButton{
	private Casa casa;
	public BotaoCasa(Casa casa) {
		this.casa = casa;
	}
	public int RetornaPosicao() {
		return casa.getPosicao();
		
	}
	public void BotaoFoiVisitado() {
		if(casa.isFoiVisitada()) {
			if(casa.getAluno() != null ) {
				this.setIcon(editaImagem(casa.getImageAluno()));
				this.setBackground(Color.green);
			}else if(casa.getBug() != null  ) {
				this.setIcon(editaImagem(casa.getImageBug()));
				this.setBackground(Color.red);
			}else{
				this.setIcon(null);
				this.setBackground(Color.LIGHT_GRAY);
			}
			this.setEnabled(false);
			
		}
	}
	public ImageIcon editaImagem(ImageIcon icon) {
		Image imagem = icon.getImage();
		ImageIcon novaImage = new ImageIcon(imagem.getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		return novaImage;
	}
	public Casa getCasa() {
		return casa;
	}
}
