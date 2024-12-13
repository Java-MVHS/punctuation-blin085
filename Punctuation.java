/* Bo Ruei Lin
 * Period 5
 * 12-13-2024
 * Punctuation.java
 * This code takes in a long piece of text and prints out the words that have punctuation attached to it. 
 * It has five methods including main that checks each word individually.
 * Pseudocode:
 * Punctuation class
 * no field variables
 * main:
 * instance of class
 * call searchIt method
 * searchIt:
 * store text as str
 * create String object called word
 * for (int i = 0; i < str.length(); i++) 
 * 	new string object called character
 *  store charAt of i and convert to String as word
 * 	word += character; 
 * 	if character is space or last word, then call getPunctuationWords method, then reset word as ""
 * getPunctuationWords:
 * if call checkForPunctuation returns true, then call printWords method
 * checkForPunctuation:
 * store all punctuations as string punctuations
 * for loop that iterates through each index of the punctuations string, if matches, then return true
 * if none are matched, return false
 * printWords:
 * print the words separated by a space
 */

public class Punctuation //Punctuation class
{
    public static void main(String[] args) //main method
    {
        Punctuation p = new Punctuation(); //instance of class
        p.searchIt(); //call searchIt
    }

    public void searchIt() //searchIt method
    {
        System.out.print("\n\n\n"); //three blank lines
        String str = new String("Blood, Sweat, and Tears by Winston Churchill " +
			"May 13, 1940 " +
			"Mr. Speaker: " +
			"On Friday evening last I received His Majesty’s commission to form a new " +
			"Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition. " +
			"I have completed the most important part of this task. A War Cabinet has " + 
			"been formed of five Members, representing, with the Liberal Opposition, the unity of the " +
			"nation. The three party Leaders have agreed to serve, either in the War Cabinet or in " +
			"high executive office. The three Fighting Services have been filled. It was necessary " +
			"that this should be done in one single day, on account of the extreme urgency and " + 
			"rigour of events. A number of other key positions were filled yesterday, and I am " + 
			"submitting a further list to His Majesty tonight. I hope to complete the appointment of the " + 
			"principal Ministers during tomorrow. The appointment of the other Ministers usually " + 
			"takes a little longer, but I trust that, when Parliament meets again, this part of my task " + 
			"will be completed, and that the Administration will be complete in all respects. " + 
			"Sir, I considered it in the public interest to suggest that the House should " + 
			"be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in " + 
			"accordance with the powers conferred upon him by the Resolution of the House. At the " + 
			"end of the proceedings today, the Adjournment of the House will be proposed until " + 
			"Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The " + 
			"business to be considered during that week will be notified to Members at the earliest " + 
			"opportunity. I now invite the House, by the Resolution which stands in my name, to " + 
			"record its approval of the steps taken and to declare its confidence in the new " + 
			"Government. " +
			"Sir, to form an Administration of this scale and complexity is a serious " + 
			"undertaking in itself, but it must be remembered that we are in the preliminary stage of " + 
			"one of the greatest battles in history, that we are in action at many points in Norway and " + 
			"in Holland, that we have to be prepared in the Mediterranean, that the air battle is " + 
			"continuous and that many preparations have to be made here at home. In this crisis I " + 
			"hope I may be pardoned if I do not address the House at any length today. I hope that " + 
			"any of my friends and colleagues, or former colleagues, who are affected by the political " + 
			"reconstruction, will make all allowances for any lack of ceremony with which it has been " + 
			"necessary to act. I would say to the House, as I said to those who’ve joined this " + 
			"government: \"I have nothing to offer but blood, toil, tears and sweat.\" " +
			"We have before us an ordeal of the most grievous kind. We have before " + 
			"us many, many long months of struggle and of suffering. You ask, what is our policy? I " + 
			"will say: It is to wage war, by sea, land and air, with all our might and with all the " + 
			"strength that God can give us; to wage war against a monstrous tyranny, never " + 
			"surpassed in the dark and lamentable catalogue of human crime. That is our policy. You " + 
			"ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in " + 
			"spite of all terror, victory, however long and hard the road may be; for without victory, " + 
			"there is no survival. Let that be realised; no survival for the British Empire, no survival " + 
			"for all that the British Empire has stood for, no survival for the urge and impulse of the " + 
			"ages, that mankind will move forward towards its goal. " + 
			"But I take up my task with buoyancy and hope. I feel sure that our cause " + 
			"will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, " + 
			"and I say, \"Come then, let us go forward together with our united strength.\""); //store text as a string str
        String word = new String(""); //word string
        for (int i = 0; i < str.length(); i++) //for loop that iterates until last index
        {
            String character = new String(""); //new string called character
            character = "" + str.charAt(i); //check the index using i of the text, and store it as character
            word += character; //add it to a string called word 
            if (character.equals(" ") || i == str.length() - 1) //if reaches a space or last word
            { 
                getPunctuationWords(word); //call getPunctuationWords sending in word
                word = ""; //reset word
            }
        }
        System.out.println("\n\n\n"); //three blank lines
    }
    public void getPunctuationWords(String wordIn) //getPunctuationWords method
    {
        if (checkForPunctuation(wordIn)) //if checkForPunctuation returns true
            printWords(wordIn); //call printWords sending in wordIn
    }
    public boolean checkForPunctuation(String words) //checkForPunctuation method
    {
        String punctuations = new String("()!\"',.:;?"); //store punctuations as a string called punctuations
        for (int i = 0; i < words.length(); i++) //if i is less than the length of the word keep looping
        {
            if (punctuations.indexOf(words.charAt(i)) != -1) //iterate through the entire punctuations String
                return true; //return
        }
        return false; //return
    }
    public void printWords(String wordln) //printWords method
    {
        System.out.print(wordln); //print the word - wordln
    }
}