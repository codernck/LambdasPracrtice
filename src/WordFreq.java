import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFreq {

	public static void main(String[] args) {
		String dir = "C:\\Users\\kiran\\Desktop\\FunctionalProgramming\\notes.txt";
		try {
			String txtCntnt = readTxtFile(dir);
			txtCntnt = txtCntnt.toLowerCase(); // to get the word count irrespective of case
			txtCntnt = txtCntnt.replace(".", "").replace(",", "");
			String[] txtCntnts = txtCntnt.split(" ");
			//Map<String, Long> processWordCnt = processWordCnt(Arrays.asList(txtCntnts));
			//System.out.println(processWordCnt);
			
			

			processWordFreq2(txtCntnts); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void processWordFreq2(String[] txtCntnts) {
		Map<String, Integer> frequencyMap = new HashMap<>();
		Arrays.asList(txtCntnts).forEach(word ->
		        frequencyMap.merge(word, 1, (v, newV) -> v + newV)
		);

		System.out.println(frequencyMap);
	}

	private static Map<String, Long> processWordCnt(List<String> wordsLst) {
		Map<String, Long> wordsMap = wordsLst
										.stream()
										.map(String::toLowerCase)
										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return wordsMap;
	}

	public static String readTxtFile(String dir) throws IOException {
		try (Stream<String> lines = Files.lines(Paths.get(dir))) {
			 String data = lines.collect(Collectors.joining("\n"));
			 lines.close();
			 return data;
		} 
	}

}
