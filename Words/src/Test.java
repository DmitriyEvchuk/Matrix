
abstract class Test {

	public static void test(FactoryWords factory) {

		WordsExtractor wordsextractor = factory.getWordsExtractor();
		WordsCounter countWords = factory.getWordsCounter();
		FileReader file = factory.getFileReader();
		WordSave fileSave = factory.getWordSave();

		file.readFile();

		wordsextractor.parseString(file.getFileString());

		countWords.wordsCounter(wordsextractor.getWords());

		fileSave.save(countWords);

	}// test

	public static void main(String[] args) {

		FactoryWords factory = new FactoryWords() {

			public FileReader getFileReader() {
				return new FileReaderImplement("E:\\work\\rfc2822.txt");
			}

			public WordSave getWordSave() {
				return new WordSaveImplement("forSun.txt");
			}

			public WordsExtractor getWordsExtractor() {
				return new ImplementWordsExtraction();
			}

			public WordsCounter getWordsCounter() {
				return new WordsCounterImplement();
			};

		};

		test(factory);

	}// main

}// class;