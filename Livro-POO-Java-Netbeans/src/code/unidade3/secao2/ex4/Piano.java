package code.unidade3.secao2.ex4;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.21
 */
public class Piano implements Instrumento {

    private int volume;
    private final Synthesizer sintetizador;
    public Piano() throws MidiUnavailableException {
        sintetizador = MidiSystem.getSynthesizer();
    }
    
    @Override
    public void tocar(Melodia melodia) {
        try {
            sintetizador.open();
            MidiChannel canal = sintetizador.getChannels()[0];
            canal.programChange(1);//código ID do piano
            melodia.musica(canal, volume);
            sintetizador.close();
        } catch (MidiUnavailableException | InterruptedException ex) {
            System.out.println(ex);
            sintetizador.close();
        }
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}