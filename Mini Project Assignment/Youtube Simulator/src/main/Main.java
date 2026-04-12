package main;

import java.util.ArrayList;
import java.util.Scanner;

import models.AudioFile;
import models.File;
import models.LiveStream;
import models.Media;
import models.VideoFile;

public class Main {
	
	ArrayList<Media> medias = new ArrayList<>();
	
	public void watchHistory(Scanner sc) {
		ArrayList<Media> watchedMedias = new ArrayList<>();
		System.out.println("Watch History Media");
		int i = 1;
		int idx = 0;
		for (Media media : medias) {
			if (media instanceof File) {
				if ( ((File)media).getCurrPlay() > 0) {
					watchedMedias.add(media);
				}
			}
			else {
				if (((LiveStream)media).isPlayed()) {
					watchedMedias.add(media);
				}
			}
			
		}
		
		for (Media media : watchedMedias) {
			System.out.print("[" + i + "] ");
			if (media instanceof File) {
				((File) media).showShortHistory();
			}
			else {
				media.showShortInfo();
			}
			i++;
		}
		
		System.out.print("Index to delete (0: back): ");
		idx = sc.nextInt();
		sc.nextLine();
		
		if (idx == 0) {
			return;
		}
		
		Media tar = watchedMedias.get(idx - 1);
		//ubah jadi belum pernah di tonton
		if (tar instanceof File) {
			((File) tar).setCurrPlay(0); 
		}
		else {
			((LiveStream)tar).setIsPlayed(false);
		}
		
	}
	
	public void playMedia(Scanner sc) {
		System.out.println("Play Media");
		int i = 1;
		int idx = 0;
		for (Media media : medias) {
			System.out.print("[" + i + "] ");
			media.showShortInfo();
			i++;
		}
		System.out.print("Choose index: ");
		idx = sc.nextInt();
		sc.nextLine();
		medias.get(idx - 1).play();
		
		Media tar = medias.get(idx - 1);
		int pil;
		System.out.println();
		if ( tar instanceof File ) {
			do {
				System.out.print("Choose (0: back|1: skip forward|2: skip backward):");
				pil = sc.nextInt();
				sc.nextLine();
				System.out.println();
				switch (pil) {
					case 0: return;
					case 1: ((File) tar).skipForward();
							break;
					case 2: ((File) tar).skipBackward();
							break;
				}
				System.out.println();
			} while (pil != 0);
			
		}
		else {
			System.out.print("Choose (0: back): ");
			pil = sc.nextInt();
			sc.nextLine();
			return;
			
		}
		
		
	}
	
	public void addMedia(Scanner sc) {
		int ch;
		String title;
		String desc;
		int dur;
		System.out.println("Add Media");
		System.out.println("1. Add Audio File");
		System.out.println("2. Add Video File");
		System.out.println("3. Add Live Stream");
		System.out.println("4. Back");
		System.out.print("Choose: ");
		ch = sc.nextInt();
		sc.nextLine();
		if (ch == 4) {
			return;
		}
		do {
			System.out.print("Title (3-30 characters): ");
			title = sc.nextLine();
		} while (title.length() < 3 || title.length() > 30);
		
		do {
			System.out.print("Description (5 - 50 characters): ");
			desc = sc.nextLine();
		} while (desc.length() < 5 || desc.length() > 50);
		
		if (ch == 1) {
			do {
				System.out.print("Duration (10-999): ");
				dur = sc.nextInt();
				sc.nextLine();
			}while (dur < 10 || dur > 999);
			
			medias.add(new AudioFile(title, desc, dur));
		}
		else if (ch == 2) {
			do {
				System.out.print("Duration (10-999): ");
				dur = sc.nextInt();
				sc.nextLine();
			}while (dur < 10 || dur > 999);
			
			medias.add(new VideoFile(title, desc, dur));
		}
		else if (ch == 3 ) {
			medias.add(new LiveStream(title, desc));
		}
		

		System.out.println("Media added!");
	}

	public Main() {
		
		Scanner sc = new Scanner(System.in);
		
		medias.add(new AudioFile("Nasi Goreng", "Nasi ini enak banget nikmat kenikmatan sukses", 120));
		medias.add(new VideoFile("Ayam Goreng", "Anjir enak banget anjir anasisafds", 160));
		medias.add(new LiveStream("Nasi Lemak", "Nasi Lemak ni enak kali wak"));
		
		int opt;
		do {
			System.out.println("Youtube");
			System.out.println("-------------------");
			System.out.println("1. Add Media");
			System.out.println("2. Play Media");
			System.out.println("3. Watch History");
			System.out.println("4. Exit");
			System.out.println("Choose:");
			System.out.print(">> ");
			opt = sc.nextInt();
			switch (opt) {
			case 1: addMedia(sc);
				break;
			case 2: playMedia(sc);
				break;
			case 3: watchHistory(sc);
				break;
			case 4: System.out.println("Exiting...");
				break;
			}
			
		} while (opt != 4);
		
		
	
	}

	public static void main(String[] args) {
		
		new Main();
	}

}
