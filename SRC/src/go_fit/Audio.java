/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package go_fit;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Acer
 */
public class Audio 
{
    public static void main(String arg[])
    {
        
    }
    
    public static void playmusic(String filepath)
    {
        InputStream music;
        try
        {
            music = new FileInputStream(new File(filepath));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
     public static void stopmusic()
    {
        InputStream music;
        try
        {
            AudioPlayer.player.stop();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
}
