package de.guj.eam;

import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.CharSetUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;
import org.w3c.dom.Text;

/**
 * Hello world!
 *
 */
public class App 
{
    private static String textString;

    public static void main( String[] args )
    {
        /*
         *StringUtils 
         */
        textString = "Hallo. Ich bin ein kleiner Blindtext. Und zwar schon so lange ich denken kann. Es war nicht leicht zu verstehen, was es bedeutet, ein blinder Text zu sein: Man ergibt keinen Sinn. Wirklich keinen Sinn. Man wird zusammenhangslos eingeschoben und rumgedreht – und oftmals gar nicht erst gelesen. Aber bin ich allein deshalb ein schlechterer Text als andere? Na gut, ich werde nie in den Bestsellerlisten stehen. Aber andere Texte schaffen das auch nicht. Und darum stört es mich nicht besonders blind zu sein. Und sollten Sie diese Zeilen noch immer lesen, so habe ich als kleiner Blindtext etwas geschafft, wovon all die richtigen und wichtigen Texte meist nur träumen.";
        final String upper = StringUtils.upperCase(textString);
        System.out.println("Alles groß: " + upper);
        final String abbrev = StringUtils.abbreviateMiddle(textString, " [...] ", 59);
        System.out.println("Abkürzung mittig: " + abbrev);
        final int matches = StringUtils.countMatches(textString, "ich");
        System.out.println("Matches: "+ matches);

        /** 
         *RandomStringUtils
         */
        System.out.println("Sicheres Passwort: " + RandomStringUtils.randomAlphanumeric(16));
        System.out.println("Sehr sicheres Passwort: " + RandomStringUtils.random(30, "Hi§%_l?YB!qf#"));

        /**
         * CharSetUtils
         */
        System.out.println("Ohne Vokale: " + CharSetUtils.delete(textString, "a" + "e" + "i" + "o" + "u"));
        System.out.println("Vokale: " + CharSetUtils.count(textString, "a" + "e" + "i" + "o" + "u"));

        /**
         * ObjectUtils
         */
        int[] intArray = {5, 8, 10, 13}; 
        System.out.println("Keine Null-Werte: " + ObjectUtils.allNotNull(intArray));

        /**
         * ArrayUtils
         */
        intArray = ArrayUtils.add(intArray, 39);
        System.out.println("y + neues Element: " + Arrays.toString(intArray)); 
        
        /**
         * Boolean Utils
         */
        String bool = "yes";
        System.out.println("String: " + bool);
        System.out.println("String als Boolean: " + BooleanUtils.toBoolean(bool));
    }
}
