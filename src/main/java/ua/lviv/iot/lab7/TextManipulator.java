package ua.lviv.iot.lab7;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TextManipulator {

    public String removeWordsOnConsonant(String text, int wordLength) {
        if (wordLength < 1) return new String(text);

        return text.replaceAll("\\b[B-Zb-z&&[^eiouyEIOUY]][A-Za-z]{" + (wordLength-1) + "}\\b","");
    }

}
