package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class WordList {
	private static ArrayList<String> wordList = null;
	private static WordList list = null;
	

	private WordList() {
		wordList = new ArrayList<String>();
		try {
			getList();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static WordList getInstance() {
		if(list == null) {
			return new WordList();
		}else {
			return list;
		}
	}

	public void getList() throws IOException {
		File list = new File("E:\\Java Projects\\Wordle\\src\\application\\wordList");
		FileReader fileReader = new FileReader(list);
		try (BufferedReader br = new BufferedReader(fileReader)) {
			while (br.ready()) {
				wordList.add(br.readLine());
			}
		}
	}
	
	public String randomWord() {
		Random rand = new Random();
		String word = WordList.getWordList().get(rand.nextInt(WordList.getWordList().size()));
		return word;
	}
	
	public static ArrayList<String> getWordList() {
		return wordList;
	}


}
