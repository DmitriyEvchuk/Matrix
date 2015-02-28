interface FactoryWords {

	WordsExtractor getWordsExtractor();

	WordsCounter getWordsCounter();

	FileReader getFileReader();

	WordSave getWordSave();
}
