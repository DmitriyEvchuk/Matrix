interface FactoryWords {

	WordsExtractor getWordsExtractor();

	WordsCounter getWordsCounter();

	FileReader getFileReader(String fileName);

	WordSave getWordSave(String fileName);
}
