import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.*;

public class EncouragingWords {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 16);
    JButton startButton, choice1, choice2, choice3, choice4, choice5, choice6;
    JTextArea mainTextArea;
    String position;

    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();

    public static void main(String[] args) {

        new EncouragingWords();
    }

    public EncouragingWords(){

        window = new JFrame();
        window.setSize(800, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("For You");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton(":)");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

    public void createGameScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 600);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Get your butthole wet, puckered and ready for fun ;)");
        mainTextArea.setBounds(100, 100, 600, 600);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(700, 350, 300, 300);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        choice5 = new JButton("Choice 5");
        choice5.setBackground(Color.black);
        choice5.setForeground(Color.white);
        choice5.setFont(normalFont);
        choice5.setFocusPainted(false);
        choice5.addActionListener(choiceHandler);
        choice5.setActionCommand("c5");
        choiceButtonPanel.add(choice5);

        choice6 = new JButton("Choice 6");
        choice6.setBackground(Color.black);
        choice6.setForeground(Color.white);
        choice6.setFont(normalFont);
        choice6.setFocusPainted(false);
        choice6.addActionListener(choiceHandler);
        choice6.setActionCommand("c6");
        choiceButtonPanel.add(choice6);

        start();

    }
    public void start(){
        beginning();
    }
    public void beginning(){
        position = "beginning";
        mainTextArea.setText("Hi bby, I'm here to tell you some encouraging shit, fun facts, short stories, and/or something about us.\nWanna get started? " +
                "1: A short story? 2: Fun fact? 3: Encouraging shit? 4: Something about us? 5: Other?");
        choice1.setText("A short story");
        choice2.setText("Fun fact");
        choice3.setText("Encouraging shit");
        choice4.setText("Something about us");
        choice5.setText("Other");
    }
    public void shortStory(){
        position = "shortStory";
        mainTextArea.setText("Which story do you wanna read?\n1: Psychic Daughter\n2: Tricky Jar\n3: Helicopter Ride \n4: Preacher's Wife \n5: Speeding Motorist");
        choice1.setText("Psychic Daughter");
        choice2.setText("Tricky Jar");
        choice3.setText("Helicopter Ride");
        choice4.setText("Preacher's Wife");
        choice5.setText("Speeding Motorist");
        choice6.setText("Beginning");
    }
    public void funFact(){
        position = "funFact";
        mainTextArea.setText("Suuuupp biiihh, what kind of fun fact do you wanna know?\n1: Animals \n2: Weird People Shit\n3: Back to beginning");
        choice1.setText("Animals");
        choice2.setText("Weird People Shit");
        choice3.setText("Beginning");
        choice4.setText("");
        choice4.setVisible(false);
        choice5.setVisible(false);
    }
    public void animals(){
        position = "animals";
        mainTextArea.setText("Which one?\n1: Scrimp ?\n2: Koala ?\n3: Frog ?\n4: Back to fun facts");
        choice1.setText("Scrimp");
        choice2.setText("Koala");
        choice3.setText("Frog");
        choice4.setText("Back to fun facts");
    }
    public void scrimp(){
        position = "scrimp";
        mainTextArea.setText("The heart of a shrimp is located in its head. (o.o)");
    }
    public void koala(){
        position = "koala";
        mainTextArea.setText("The fingerprints of a koala are so indistinguishable from humans that they have on occasion been confused at a crime scene.(can't trust these hoes smh)");
    }
    public void frog(){
        position = "frog";
        mainTextArea.setText("It is possible to hypnotize a frog by placing it on its back and gently stroking its stomach.(honestly who had to figure this out??)");
    }
    public void weirdPeopleShit(){
        position = "weirdPeopleShit";
        mainTextArea.setText("Pick your poison.\n1: Farts\n2: Dead People\n3: Meds\n4: Back to fun facts");
        choice1.setText("Farts");
        choice2.setText("Dead people");
        choice3.setText("Meds");
        choice4.setText("Back to fun fact");
    }
    public void farts(){
        position = "farts";
        mainTextArea.setText("Farts have been clocked at a speed of 10 feet per second. (Must've measured Baileys)");
    }
    public void deadPeople(){
        position = "deadPeople";
        mainTextArea.setText("In France, it is legal to marry a dead person. (hmmm.... to each their own i guess o.o)");
    }
    public void meds(){
        position = "meds";
        mainTextArea.setText("Ketchup was sold in the 1830s as medicine. (ew so nasty and ik what youll say 'its good shit' but no you're wrong)");
    }
    public void words(){
        position = "words";
        mainTextArea.setText("Pick a number any number!!\n1 \n2 \n3 \n4 \n5 \n6: Back to start");
        choice1.setText("1");
        choice2.setText("2");
        choice3.setText("3");
        choice4.setText("4");
        choice5.setText("5");
        choice6.setText("Beginning");
    }
    public void words1() {
        position = "words1";
        mainTextArea.setText("I love you so much bby and I think you are so smart and amazing!");
    }
    public void words2() {
        position = "words2";
        mainTextArea.setText("Sí, se puede, you can do it!! Literal translation is 'yes you can' but it's is you can do it and you can since you are great at what you do including being my boyfriend and a puppy parent ;)");
    }
    public void words3() {
        position = "words3";
        mainTextArea.setText("Ya know, if you're having a hard time with whatever you are doing right now; I really hope these help you even just a little bit. If you're stuck" +
                "I hope these give you a little break from the frustration and put a smile on your face so you can feel rejuvenated");
    }
    public void words4() {
        position = "words4";
        mainTextArea.setText("Mandatory anoucement: You are amazing, funny, smart, hard working, fantastic boyfriend, superb student(for architecture) and" +
                "you will go great places and do great things not to be generic and halmarky or anything");
    }
    public void words5() {
        position = "words5";
        mainTextArea.setText("Don't let your dreams be dreams. JUST DO ITTTTT!!! hehe but actually bby if you dream of something try and do it! No harm in just trying and " +
                "if it doesn't work out it wasn't meant to be and i'll be here with you <3");
    }
    public void us(){
        position = "us";
        mainTextArea.setText("Some shit about us!!! Yayyyy! :)\n1: Funny\n2: Sweet\n3: NSFW\n4: Song\n5: Back to the Beginning");
        choice1.setText("Funny");
        choice2.setText("Sweet");
        choice3.setText("NSFW");
        choice4.setText("Song");
        choice5.setText("Beginning");
    }
    public void funny() {
        position = "funny";
        mainTextArea.setText("Remember when you went to take me out to get ice cream and you ran that light and got a ticket?? aahaha bc i do, we allll do XD");
    }
    public void sweet() {
        position = "sweet";
        mainTextArea.setText("Not to be cliche, but when I first looked at you (after freshly being single and ready for the single life in college) I thought 'ahhhh shiiiittt dawg, i'm trapped' and" +
                "I blamed it on the nose ring, but I just somehow knew I wanted you for as long as I could have you.");
    }
    public void NSFW() {
        position = "NSFW";
        mainTextArea.setText("I often fantasize about you at the most inappropriate moments and it always involves you taking control and having your way with me. It becomes a problem because sometimes all" +
                "I can think about is you just slamming into me or I picture you naked or how you look when you go down on me and I start to tingle.");
    }
    public void song() {
        position = "song";
        mainTextArea.setText("We don't *officially* have a song, but I often think of you when I hear 1950 by King Princess and Needy by Ariana Grande");
    }
    public void other(){
        position = "other";
        mainTextArea.setText("Pick a number and you will get something random\n1\n2\n3\n4\n5");
        choice1.setText("1");
        choice2.setText("2");
        choice3.setText("3");
        choice4.setText("4");
        choice5.setText("5");
    }
    public void other1() {
        position = "other1";
        mainTextArea.setText("hehehehheheeeeeeeeeeeeeeeeeeeeeehhhhhhhhhhhhe this is a pointless message dedicated to randomness");
    }
    public void other2() {
        position = "other2";
        mainTextArea.setText("Check out this website: https://www.boredbutton.com/random");
    }
    public void other3() {
        position = "other3";
        mainTextArea.setText("Nothing to see here, move along, move along dont have to go back but cant stay here");
    }
    public void other4() {
        position = "other4";
        mainTextArea.setText("Sometimes I think about how someone had to play with cow titties and drink out of them for milk");
    }
    public void other5() {
        position = "other5";
        mainTextArea.setText("Hahaha tricked ya this brings you back to the beginning. :P");
    }
    public void psychicDaughter(){
        position = "psychicDaughter";
        mainTextArea.setText("Bill is putting his young daughter to bed one night and as he walks out the bedroom door he hears her saying her prayers. She says, \"God bless mommy, daddy, and grandma, rest in peace grandpa.\"" +
                "                    Bill rushes back into her bedroom and asks her, \"Why did you say the last part?\" His daughter replies, \"Because I needed to.\"" +
                "                    The next day, grandpa dies of a heart attack. Bill is worried about his daughter but thinks, \"It must just be a sad coincidence.\"" +
                "                    That night he tucks his daughter into bed again and once again he hears her saying her prayers. She says, \"God bless mommy and daddy, rest in peace grandma.\"" +
                "                    Bill is now really worried and thinking to himself, \"Can my daughter really see into the future?\" The next day, grandma dies and now Bill is convinced his daughter can predict the future" +
                "                    For the rest of the week nothing happens, but on the Sunday night as Bill leaves his daughter's bedroom he waits outside and listens for any more prayers. Sure enough, he hears her say," +
                "                    \"God bless you mommy, rest in peace daddy.\" Now Bill is really panicking and thinking, '\"Oh God, I'm going to die tomorrow!\"" +
                "                    The following day Bill is in a complete mess all day in work; a real nervous wreck. He constantly checks the clock, looks around the room and is on edge all the time expecting to die at any moment." +
                "                    \"He is so nervous that he doesn't leave the office until it's past midnight. Once it turns midnight he says to himself with relief, \"How is this possible? I should be dead!\"" +
                "                    He goes home and walks into the house to find his wife sitting on the sofa with a scared look on her face. She asks him, \"Where have you been? What took you so long?\"" +
                "                    Bill replies, \"Listen honey, today I haven't had the best of days\" and he is just about to tell her what has happened when she starts crying and bursts out, \"I saw the mailman die yesterday!\"");
        choice1.setText("Beginning");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("");
    }
    public void trickyJar(){
        position = "trickyJar";
        mainTextArea.setText("An 85-year-old man goes to see his doctor for his regular physical exam. The doctor says that the man needs to provide a sperm sample and gives him a jar saying, \\\"T\" +\n" +
                "                    \"ake this jar home with you and come back tomorrow with a sperm sample.\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"The next day the old man goes back to the doctors and gives him the jar, which is as clean and empty as when the doctor gave it to him. So the doctor asks what \" +\n" +
                "                    \"happened and why there is no sperm sample in the jar. The old man says, \\\"Well, doc, it's like this... first I tried with my right hand, but nothing. Then I tried with my left hand, but still nothing. \" +\n" +
                "                    \"Then I asked my wife for help. She tried with her right hand - nothing; then with her left, still nothing. She tried with her mouth, first with the teeth in, then with her teeth out, still nothing. \" +\n" +
                "                    \"We even called up Maisie, the lady next door and she tried too, first with both hands, then an armpit, and she even tried squeezing it between her knees, but still nothing.\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"The doctor is really shocked by all this and asks incredulously, \\\"You asked your neighbor???\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"The old man replies, \\\"Yep, not one of us could get the jar open.\\\"");
        choice1.setText("Beginning");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void helipcoterRide(){
        position = "helipcoterRide";
        mainTextArea.setText("Walter took his wife Ethel to the state fair every year, and every time he would say to her, \\\"Ethel, you know that I'd love to go for a ride in that helicopter.\\\" \" +\n" +
                "                    \"But Ethel would always reply, \\\"I know that Walter, but that helicopter ride is 50 dollars and 50 dollars is 50 dollars.\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"Finally, they went to the fair, and Walter said to Ethel, \\\"Ethel, you know I'm 87 years old now. If I don't ride that helicopter this year, I may never get another chance.\\\" \" +\n" +
                "                    \"Once again Ethel replied, \\\"Walter, you know that helicopter is 50 dollars and 50 dollars is 50 dollars.\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"This time the helicopter pilot overheard the couple's conversation and said, \\\"Listen folks, I'll make a deal with you. I'll take both of you for a ride; \" +\n" +
                "                    \"if you can both stay quiet for the entire ride and not say a word I won't charge you! But if you say just one word, it's 50 dollars.\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"Walter and Ethel agreed and up they went in the helicopter. The pilot performed all kinds of fancy moves and tricks, but not a word was said by either Walter or Ethel. \" +\n" +
                "                    \"The pilot did his death-defying tricks over and over again, but still there wasn't so much as one word said. When they finally landed, the pilot turned to Walter and said, \\\"\" +\n" +
                "                    \"Wow! I've got to hand it to you. I did everything I could to get you to scream or shout out, but you didn't. I'm really impressed!\\\"\\r\\n");
        choice1.setText("Beginning");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void preachersWife(){
        position = "preachersWife";
        mainTextArea.setText("A couple were going on a vacation together but the wife had an emergency at work. So they agreed the husband would go as planned and his wife would meet him at the hotel the next day.\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"When the husband got to his hotel and had checked in, he thought he should send his wife a quick email letting her know he'd got there ok.\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"As he typed in her email address, he made a typo and his email was sent to an elderly preacher’s wife whose instead. It just so happened that her husband had sadly died just the day before.\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"When the grieving old preacher's wife checked her emails, she read the one from the holiday maker, let out an awful, loud, piercing scream, and fainted on the floor.\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"At the sound of her falling, her family rushed into the room. They tended to her and then looked at her computer and saw this email on her screen:\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"Dearest Wife,\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"Just checked in to my room. Everything is prepared for your arrival tomorrow.\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"P.S. It sure is hot down here.");
        choice1.setText("Beginning");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void speedingMotorist(){
        position = "speedingMotorist";
        mainTextArea.setText("Late one night this guy is speeding down the empty road. A cop sees him go flying past so chases him and pulls him over. \" +\n" +
                "                    \"The cop goes up to the car and when the man rolls down the speedingMotoristdow, he asks, \\\"Are you aware of how fast you were going, sir?\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"The man replies, \\\"Yes I am. I'm trying to escape a robbery I got involved in.\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"The cop looks at him disbelievingly and asks him, \\\"Were you the one being robbed, sir?\\\"\\r\\n\" +\n" +
                "                    \"The man casually replies, \\\"Oh no, I was the one who committed the robbery. I was escaping.\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"The cop is shocked and surprised that the man has admitted this so freely. He says, \\\"So you're telling me you were speeding...AND committed a robbery?\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"\\\"Oh yes,\\\" replies the man calmly. \\\"I have all the loot in the back.\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"The cop is now starting to get angry and says, \\\"Sir, I'm afraid you have to come with me\\\" as he reaches into the window to take the car keys out of the ignition.\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"The man shouts, \\\"Don't do that! I'm afraid that you'll find the gun in my glove compartment!\\\" At this the cop pulls his hand out of the window and says, \\\"Wait here\\\" as he returns to his car and calls for backup.\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"Soon there are cars, cops and helicopters all over, everywhere you look. The man is quickly dragged out of his car, handcuffed and taken towards a cop car.\" +\n" +
                "                    \" However, just before he is put in the car and taken away a cop walks up to him and says, while pointing at the cop that pulled him over, \\\"\" +\n" +
                "                    \"Sir, this officer tells us that you had committed a robbery, had stolen loot in the trunk of your car, and had a loaded gun in your glove compartment. However, we didn't find any of these things in your car.\\\"\\r\\n\" +\n" +
                "                    \"\\r\\n\" +\n" +
                "                    \"The man replies, \\\"Yeah, and I bet that liar said I was speeding too!\\\"");
        choice1.setText("Beginning");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }



    public class TitleScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            createGameScreen();
        }
    }
    public class ChoiceHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String yourChoice = event.getActionCommand();

            switch(position){
                case "beginning":
                    switch(yourChoice){
                        case "c1": shortStory(); break;
                        case "c2": funFact(); break;
                        case "c3": words(); break;
                        case "c4" : us(); break;
                        case "c5" : other(); break;
                    }
                    break;
                case "shortStory":
                    switch(yourChoice){
                        case "c1" : psychicDaughter(); break;
                        case "c2" : trickyJar(); break;
                        case "c3" : helipcoterRide(); break;
                        case "c4" : preachersWife(); break;
                        case "c5" : speedingMotorist(); break;
                        case "c6" : beginning(); break;
                    }
                    break;
                case "funFact":
                    switch(yourChoice){
                        case "c1": animals(); break;
                        case "c2" : weirdPeopleShit(); break;
                    }
                    break;
                case "animals" :
                    switch (yourChoice) {
                        case "c1" : scrimp(); break;
                        case "c2" : koala(); break;
                        case "c3" : frog(); break;
                        case "c4" : funFact(); break;
                    }
                    break;
                case "weirdPeopleShit" :
                    switch (yourChoice) {
                        case "c1" : farts(); break;
                        case "c2" : deadPeople(); break;
                        case "c3" : meds(); break;
                        case "c4" : funFact(); break;
                    }
                    break;
                case "words":
                    switch(yourChoice){
                        case "c1" : words1(); break;
                        case "c2" : words2(); break;
                        case "c3" : words3(); break;
                        case "c4" : words4(); break;
                        case "c5" : words5(); break;
                        case "c6" : beginning(); break;
                    }
                    break;
                case "us":
                    switch(yourChoice){
                        case "c1" : funny(); break;
                        case "c2" : sweet(); break;
                        case "c3" : NSFW(); break;
                        case "c4" : song(); break;
                        case "c5" : beginning(); break;
                    }
                    break;
                case "other":
                    switch(yourChoice){
                        case "c1" : other1(); break;
                        case "c2" : other2(); break;
                        case "c3" : other3(); break;
                        case "c4" : other4(); break;
                        case "c5" : other5(); beginning(); break;
                    }
                    break;
                case "psychicDaughter":
                case "trickyJar":
                case "helipcoterRide":
                case "preachersWife":
                case "speedingMotorist":
                    switch(yourChoice){
                        case "c1": beginning(); break;
                    }
                    break;

            }


        }
    }
}