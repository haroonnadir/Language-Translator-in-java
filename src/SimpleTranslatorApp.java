// PACKAGES 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// PUBLIC CLASS 
public class SimpleTranslatorApp {

    // OBJECTS 
    private JComboBox<String> fromLng;
    private JComboBox<String> toLng;
    private JTextArea t1, t2;
    private JFrame frame;
    private JLabel l1, background, l2;
    private JButton b2, b1;
    private Container c;
    private Font f, h, btn, cr;
    private String[] lngs = { "English" };
    private String[] allLanguages = { "Urdu", "French", "Spanish", "Hindi", "Arabic", "German", "Chinese", "Italian",
            "Japanese" };

    // SHOWING GUI THROUGHT CONSTRUCTOR  
    public SimpleTranslatorApp() {

        // FRAME
        frame = new JFrame("Language Translator");
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);

        // BACKGROUND IMAGE
        try {
            ImageIcon backgroundImage = new ImageIcon("img/1.jpg");
            background = new JLabel(backgroundImage);
            background.setBounds(0, 0, frame.getWidth(), frame.getHeight());
            frame.add(background);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // CONTAINER
        c = frame.getContentPane();
        c.setLayout(null);
        background.setLayout(null);

        // FONTS
        h = new Font(Font.SERIF, Font.ITALIC, 65);
        f = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
        btn = new Font(Font.SANS_SERIF, Font.BOLD, 22);
        cr = new Font(Font.SANS_SERIF, Font.PLAIN, 16);

        // HEADING
        l1 = new JLabel("Language Translator");
        l1.setBounds(660, 200, 800, 100);
        l1.setFont(h);
        l1.setForeground(new Color(199, 216, 235));

        // SOURCE LANGUAGE TEXTFIELD
        fromLng = new JComboBox<>(lngs);
        fromLng.setBounds(500, 350, 450, 50);
        fromLng.setFont(f);
        fromLng.setSelectedIndex(0);
        fromLng.setBackground(new Color(11, 11, 11, 255));
        fromLng.setForeground(new Color(181, 227, 230));

        // TARGET LANGUAGE COMBOBOX
        toLng = new JComboBox<>(allLanguages);
        toLng.setBounds(1000, 350, 450, 50);
        toLng.setFont(f);
        toLng.setBackground(new Color(11, 11, 11, 255));
        toLng.setForeground(new Color(181, 227, 230));

        // SOURCE LANGUAGE TEXTFIELD
        t1 = new JTextArea();
        JScrollPane scrollPane1 = new JScrollPane(t1, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane1.setBounds(500, 420, 450, 200);
        t1.setFont(f);
        t1.setBackground(new Color(11, 11, 11, 255));
        t1.setForeground(new Color(181, 227, 230));

        // TARGET LANGUAGE TEXTFIELD
        t2 = new JTextArea();
        JScrollPane scrollPane2 = new JScrollPane(t2, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane2.setBounds(1000, 420, 450, 200);
        t2.setFont(f);
        t2.setBackground(new Color(11, 11, 11, 255));
        t2.setForeground(new Color(181, 227, 230));

        // TRANSLATE BUTTON
        b1 = new JButton("Translate");
        b1.setBounds(500, 640, 450, 50);
        b1.setFont(btn);
        b1.addActionListener(new TranslateButtonListener());
        b1.setBorderPainted(true);
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);
        b1.setForeground(new Color(202, 223, 224));
        b1.setBorder(BorderFactory.createBevelBorder(0, new Color(143, 56, 201), new Color(51, 101, 181))); 

        // CLEAR BUTTON
        b2 = new JButton("Clear");
        b2.setBounds(1000, 640, 450, 50);
        b2.setBorderPainted(true);
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);
        b2.setForeground(new Color(202, 223, 224));
        b2.setFont(btn);
        b2.addActionListener(new ClearButtonListener());
        b2.setBorder(BorderFactory.createBevelBorder(0, new Color(143, 56, 201), new Color(51, 101, 181)));

        // BOTTOM TEXT
        l2 = new JLabel("\u00A9" + " 2024 : Design and Developed by Group (9)");
        l2.setBounds(1580, 1000, 350, 50);
        l2.setFont(cr);
        l2.setForeground(new Color(181, 227, 230));

        // ADDING COMPONENTS TO CONTAINER
        background.add(l1);
        background.add(fromLng);
        background.add(toLng);
        background.add(scrollPane1);
        background.add(scrollPane2);
        background.add(b1);
        background.add(b2);
        background.add(l2);

        frame.setVisible(true);
    }

    // SWITCHING LANGUAGES
    private String translateText(String text, String sourceLanguage, String targetLanguage) {
        switch (sourceLanguage) {
            case "English":
                switch (targetLanguage) {
                    case "Urdu":
                        return translateToUrdu(text);
                    case "French":
                        return translateToFrench(text);
                    case "Spanish":
                        return translateToSpanish(text);
                    case "Hindi":
                        return translateToHindi(text);
                    case "Arabic":
                        return translateToArabic(text);
                    case "German":
                        return translateToGerman(text);
                    case "Chinese":
                        return translateToChinese(text);
                    case "Italian":
                        return translateToItalian(text);
                    case "Japanese":
                        return translateToJapanese(text);
                    default:
                        return "Translation not available";
                }
            default:
                return "Translation not available";
        }
    }

    // TRANSLATION LOGIC (FOR URDU)
    private String translateToUrdu(String text) {
        switch (text) {
            case "hello":
                return "ہیلو";
            case "how are you":
                return "آپ کیسے ہیں";
            case "what is your name":
                return "آپ کا نام کیا ہے";
            case "hi":
                return "ہائی";
            case "aslam o alikum":
                return "السلام علیکم";
            case "walikum salam":
                return "وعلیکم السلام";
            case "aryan":
                return "آریان";
            case "where are you from":
                return "آپ کہاں سے ہیں";
            case "what do you do":
                return "آپ کیا کام کرتے ہیں";
            case "good":
                return "اچھا";
            case "well":
                return "ٹھیک ہوں";
            case "bad":
                return "برا";
            case "perfect":
                return "مکمل";
            case "meet me":
                return "مجھ سے ملاقات ہو";
            default:
                return "Translation not available";
        }
    }
   
    // TRANSLATION LOGIC (FOR FRENCH)
    private String translateToFrench(String text) {
        switch (text) {
            case "hello":
                return "Bonjour";
            case "how are you":
                return "Comment ça va";
            case "what is your name":
                return "Comment tu t'appelles";
            case "hi":
                return "Salut";
            case "aslam o alikum":
                return "Salam";
            case "walikum salam":
                return "Salam aussi";
            case "aryan":
                return "Aryan";
            case "where are you from":
                return "D'où es-tu";
            case "what do you do":
                return "Que fais-tu";
            case "good":
                return "Bien";
            case "well":
                return "Bien aussi";
            case "bad":
                return "Mal";
            case "perfect":
                return "Parfait";
            case "meet me":
                return "Rencontre-moi";
            default:
                return "Translation not available";
        }
    }

    // TRANSLATION LOGIC (FOR SPANISH)
    private String translateToSpanish(String text) {
        switch (text) {
            case "hello":
                return "Hola";
            case "how are you":
                return "¿Cómo estás?";
            case "what is your name":
                return "¿Cuál es tu nombre?";
            case "hi":
                return "Hola también";
            case "aslam o alikum":
                return "Asalamo Alaikum";
            case "walikum salam":
                return "Wa Alaikum Salam";
            case "aryan":
                return "Aryan";
            case "where are you from":
                return "¿De dónde eres?";
            case "what do you do":
                return "¿Qué haces?";
            case "good":
                return "Bien";
            case "well":
                return "Bien también";
            case "bad":
                return "Mal";
            case "perfect":
                return "Perfecto";
            case "meet me":
                return "Conóceme";
            default:
                return "Translation not available";
        }
    }

    // TRANSLATION LOGIC (FOR HINDI)
    private String translateToHindi(String text) {
        switch (text) {
            case "hello":
                return "नमस्ते";
            case "how are you":
                return "कैसे हो";
            case "what is your name":
                return "तुम्हारा नाम क्या है";
            case "hi":
                return "हाय";
            case "aslam o alikum":
                return "अस्सलाम वालेकुम";
            case "walikum salam":
                return "वालेकुम अस्सलाम";
            case "aryan":
                return "आर्यन";
            case "where are you from":
                return "तुम कहाँ से हो";
            case "what do you do":
                return "तुम क्या काम करते हो";
            case "good":
                return "अच्छा";
            case "well":
                return "ठीक हूँ";
            case "bad":
                return "बुरा";
            case "perfect":
                return "पूर्ण";
            case "meet me":
                return "मिलो मुझसे";
            default:
                return "Translation not available";
        }
    }

    // TRANSLATION LOGIC (FOR ARABIC)
    private String translateToArabic(String text) {
        switch (text) {
            case "hello":
                return "مرحبا";
            case "how are you":
                return "كيف حالك";
            case "what is your name":
                return "ما اسمك";
            case "hi":
                return "مرحبًا";
            case "aslam o alikum":
                return "السلام عليكم";
            case "walikum salam":
                return "وعليكم السلام";
            case "aryan":
                return "آريان";
            case "where are you from":
                return "من أين أنت";
            case "what do you do":
                return "ماذا تعمل";
            case "good":
                return "جيد";
            case "well":
                return "بخير أيضا";
            case "bad":
                return "سيء";
            case "perfect":
                return "ممتاز";
            case "meet me":
                return "التقي بي";
            default:
                return "Translation not available";
        }
    }

    // TRANSLATION LOGIC (FOR GERMAN)
    private String translateToGerman(String text) {
        switch (text) {
            case "hello":
                return "Hallo";
            case "how are you":
                return "Wie geht es dir";
            case "what is your name":
                return "Wie heißt du";
            case "hi":
                return "Hi";
            case "aslam o alikum":
                return "As-Salamu Alaikum";
            case "walikum salam":
                return "Wa Alaikum Salam";
            case "aryan":
                return "Aryan";
            case "where are you from":
                return "Woher kommst du";
            case "what do you do":
                return "Was machst du";
            case "good":
                return "Gut";
            case "well":
                return "Auch gut";
            case "bad":
                return "Schlecht";
            case "perfect":
                return "Perfekt";
            case "meet me":
                return "Treffen Sie mich";
            default:
                return "Translation not available";
        }
    }

    // TRANSLATION LOGIC (FOR CHINESE)
    private String translateToChinese(String text) {
        switch (text) {
            case "hello":
                return "你好";
            case "how are you":
                return "你好吗";
            case "what is your name":
                return "你叫什么名字";
            case "hi":
                return "嗨";
            case "aslam o alikum":
                return "阿拉伯问候";
            case "walikum salam":
                return "和平问候";
            case "aryan":
                return "雅利安";
            case "where are you from":
                return "你从哪里来";
            case "what do you do":
                return "你做什么";
            case "good":
                return "好的";
            case "well":
                return "很好";
            default:
                return "Translation not available";
        }
    }

    // TRANSLATION LOGIC (FOR ITALIAN)
    private String translateToItalian(String text) {
        switch (text) {
            case "hello":
                return "Ciao";
            case "how are you":
                return "Come stai";
            case "what is your name":
                return "Come ti chiami";
            case "hi":
                return "Ciao";
            case "aslam o alikum":
                return "As-Salamu Alaikum";
            case "walikum salam":
                return "Wa Alaikum Salam";
            case "aryan":
                return "Aryan";
            case "where are you from":
                return "Di dove sei";
            case "what do you do":
                return "Cosa fai";
            case "good":
                return "Bene";
            case "well":
                return "Anche bene";
            case "bad":
                return "Male";
            case "perfect":
                return "Perfetto";
            case "meet me":
                return "Incontrami";
            default:
                return "Translation not available";
        }
    }

    // TRANSLATION LOGIC (FOR JAPANESE)
    private String translateToJapanese(String text) {
        switch (text) {
            case "hello":
                return "こんにちは";
            case "how are you":
                return "お元気ですか";
            case "what is your name":
                return "あなたのお名前は何ですか";
            case "hi":
                return "こんにちは";
            case "aslam o alikum":
                return "As-Salamu Alaikum";
            case "walikum salam":
                return "Wa Alaikum Salam";
            case "aryan":
                return "アーリアン";
            case "where are you from":
                return "あなたはどこからですか";
            case "what do you do":
                return "あなたは何をしていますか";
            case "good":
                return "良い";
            case "well":
                return "元気です";
            case "bad":
                return "悪い";
            case "perfect":
                return "完璧";
            case "meet me":
                return "私に会って";
            default:
                return "Translation not available";
        }
    }

    // TRANSLATE BUTTON LOGIC
    private class TranslateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Get selected languages
            String sourceLanguage = (String) fromLng.getSelectedItem();
            String targetLanguage = (String) toLng.getSelectedItem();

            // Get text to translate
            String textToTranslate = t1.getText().toLowerCase();

            // Translate text
            String translatedText = translateText(textToTranslate, sourceLanguage, targetLanguage);

            // Display translated text
            t2.setText(translatedText);
        }
    }

    // CLEAR BUTTON LOGIC
    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Clear text areas
            t1.setText("");
            t2.setText("");
        }
    }

    // MAIN
    public static void main(String[] args) {
        new SimpleTranslatorApp();
    }
}