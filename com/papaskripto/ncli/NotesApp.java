import com.papaskripto.ncli.Note;

import java.util.HashMap;
import java.util.ArrayList;

public class NotesApp {

	HashMap<String, Note> notes = new HashMap<>();

	public void addNote (note) {
		notes.put (note);
	}

	public void deleteNote (note) {
		notes.remove (note);
	}

	public ArrayList<String> listNotes () {
		if (!notes.isEmpty ()) {
			for (Note note : notes.keySet ()) {
				return listNotes;
			}
		}
	}
}
