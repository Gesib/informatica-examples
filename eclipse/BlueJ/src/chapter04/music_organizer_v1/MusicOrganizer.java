package chapter04.music_organizer_v1;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kšlling
 * @version 2011.07.31
 */
public class MusicOrganizer {
	// An ArrayList for storing the file names of music files.
	private ArrayList<String> theListOfAllFiles;

	/**
	 * Create a MusicOrganizer
	 */
	public MusicOrganizer() {
		theListOfAllFiles = new ArrayList<String>();
	}

	/**
	 * Add a file to the collection.
	 * 
	 * @param filename
	 *            The file to be added.
	 */
	public void addFile(String filename) {
		theListOfAllFiles.add(filename);
	}

	/**
	 * Return the number of files in the collection.
	 * 
	 * @return The number of files in the collection.
	 */
	public int getNumberOfFiles() {
		return theListOfAllFiles.size();
	}

	/**
	 * List a file from the collection.
	 * 
	 * @param index
	 *            The index of the file to be listed.
	 */
	public void listFile(int index) {
		if (index >= 0 && index < theListOfAllFiles.size()) {
			String filename = theListOfAllFiles.get(index);
			System.out.println(filename);
		}
	}

	/**
	 * Remove a file from the collection.
	 * 
	 * @param index
	 *            The index of the file to be removed.
	 */
	public void removeFile(int index) {
		if (index >= 0 && index < theListOfAllFiles.size()) {
			theListOfAllFiles.remove(index);
		}
	}

	public void listAllFiles() {
		System.out.println("Alle Dateien:");
		for (int index = 0; index < theListOfAllFiles.size(); index++) {
			System.out.println("# " + (index + 1) + ": "
					+ theListOfAllFiles.get(index));
		}
	}

	public void listAllFiles_with_for_each() {
		System.out.println("Alle Dateien:");
		for (String file : theListOfAllFiles) {
			System.out.println(file);
		}
	}

	public static void test() {

		MusicOrganizer mo = new MusicOrganizer();
		mo.addFile("lied1.mp3");
		mo.addFile("lied2.mp3");
		mo.addFile("lied3.mp3");
		mo.addFile("lied4.mp3");
		mo.listAllFiles();
		mo.listAllFiles_with_for_each();
	}

	public static void testFind() {

		MusicOrganizer mo = new MusicOrganizer();
		mo.addFile("foo.mp3");
		mo.addFile("bar.mp3");
		mo.addFile("baz.mp3");
		mo.addFile("foobar.mp3");
		mo.addFile("bla.mp3");
		System.out.println("Find files bar - 2 should be shown");
		mo.findFiles("bar");
	}

	public void findFiles(String wasgesuchtwird) {
		for (String file : theListOfAllFiles) {
			if (file.contains(wasgesuchtwird))
				System.out.println("found: " + file);

		}

	}

	public static void testDelete() {

		MusicOrganizer mo = new MusicOrganizer();
		mo.addFile("foo.mp3");
		mo.addFile("bar.mp3");
		mo.addFile("baz.mp3");
		mo.addFile("foobar.mp3");
		mo.addFile("bla.mp3");
		System.out.println("before delete:");
		mo.listAllFiles();
		mo.deleteContaining("bar");
		System.out.println("should be: foo baz foobar bla");
		mo.listAllFiles();
	}

	public void deleteContaining(String nameToDelete) {
		for (int index = 0; index < theListOfAllFiles.size(); index++) {
			String file = theListOfAllFiles.get(index);
			System.out.println("Looking at file: " + file);
			if (file.contains(nameToDelete)) {
				// delete
				theListOfAllFiles.remove(index);
				return;
			}
		}

	}

	public static void main(String[] x) {
		testDelete();

	}
}
