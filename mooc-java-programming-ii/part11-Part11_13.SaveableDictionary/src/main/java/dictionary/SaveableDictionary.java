package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SaveableDictionary {

	private HashMap<String, String> translations;
	private String readedFileName;
	private PrintWriter writer;
	
	public SaveableDictionary(String file) {
		readedFileName = file;
		translations = new HashMap<String, String>();
	}


	public SaveableDictionary() {
		translations = new HashMap<String, String>();
	}

	
	public boolean load(){
		Scanner scan = null;
		try {
			File file = new File("words.txt");
			scan = new Scanner(file);
			String line;
			while(scan.hasNextLine()) {
				line = scan.nextLine();
				String[] lineParts = line.split(":");
				add(lineParts[0], lineParts[1]);
			}
			scan.close();
			return true;
		}catch(FileNotFoundException	e) {
				e.printStackTrace();
			}
		return false;
		}
	
	public boolean save() {
		try {
			writer = new PrintWriter(readedFileName);
			for(Entry<String, String> words : translations.entrySet()	) {
				writer.write(words.getKey()+":"+words.getValue()+'\n');
			}
			writer.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void add(String words, String translations) {
		this.translations.putIfAbsent(words, translations);
	}

	public String translate(String wordToTranslate) {
		if (translations.containsValue(wordToTranslate)) {
			for (Entry<String, String> word : translations.entrySet()) {
				if (word.getValue().equals(wordToTranslate)) {
					return word.getKey();
				}
			}
		}
		return translations.getOrDefault(wordToTranslate, null);
	}

	public void delete(String word) {
		if (translations.containsValue(word)) {
			translations.entrySet().removeIf(entry -> entry.getValue().equals(word));
		}
		translations.remove(word);
	}
}
