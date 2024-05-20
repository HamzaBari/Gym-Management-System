
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {

        //Below is all the hard-coded dummy data.
        //Gymnasts for mixed, male and females
        Gymnasts g1 = new Gymnasts();
        g1.mixedGendersGymnasts("Floor Exercise", "This gymnast is for both male & females");

        Gymnasts g2 = new Gymnasts();
        g2.mixedGendersGymnasts("Vault", "This gymnast is for both male & females");

        Gymnasts g3 = new Gymnasts();
        g3.maleGymnasts("Pommel Horse", "This is a male gymnast only");

        Gymnasts g4 = new Gymnasts();
        g4.maleGymnasts("Still Rings", "This is a male gymnast only");

        Gymnasts g5 = new Gymnasts();
        g5.maleGymnasts("Parallel Bars", "This is a male gymnast only");

        Gymnasts g6 = new Gymnasts();
        g6.maleGymnasts("High Bar", "This is a male gymnast only");

        Gymnasts g7 = new Gymnasts();
        g7.femaleGymnasts("Uneven Bars", "This is a female gymnast only");

        Gymnasts g8 = new Gymnasts();
        g8.femaleGymnasts("Balance Beam", "This is a female gymnast only");

        //Competitors
        Male c1 = new Male("C001", "Hamza Bari", competitorGender.male);
        Male c2 = new Male("C002", "Thomas Bell", competitorGender.male);
        Male c3 = new Male("C003", "Joan Underwood", competitorGender.male);
        Female c4 = new Female("C004", "Ruth Thomas", competitorGender.female);
        Male c5 = new Male("C005", "Vikram Shah", competitorGender.male);
        Male c6 = new Male("C006", "Peter Wilson", competitorGender.male);
        Male c7 = new Male("C007", "Ian Devlin", competitorGender.male);
        Female c8 = new Female("C008", "Deborah Atkinson", competitorGender.female);
        Male c9 = new Male("C009", "Paul Moss", competitorGender.male);
        Male c10 = new Male("C010", "Anthony Wraith", competitorGender.male);
        Female c11 = new Female("C011", "Alexander Braithewaite", competitorGender.female);
        Female c12 = new Female("C012", "Yasmin Kaur-Williams", competitorGender.female);
        Female c13 = new Female("C013", "Helen Sedgefield", competitorGender.female);
        Female c14 = new Female("C014", "Susan Whitaker", competitorGender.female);
        Female c15 = new Female("C015", "Lisa Bailey", competitorGender.female);
        Female c16 = new Female("C016", "Shelley Kirkby", competitorGender.female);
        Female c17 = new Female("C017", "Adriana Camponi", competitorGender.female);
        Female c18 = new Female("C018", "Claire Holden", competitorGender.female);
        Male c19 = new Male("C019", "Brian Oakley", competitorGender.male);
        Male c20 = new Male("C020", "Robert Tyler", competitorGender.male);
        Male c21 = new Male("C021", "David Morley", competitorGender.male);
        Male c22 = new Male("C022", "Oliver Ratcliffe", competitorGender.male);
        Male c23 = new Male("C023", "Simon Gaunt", competitorGender.male);
        Male c24 = new Male("C024", "John Cunliffe", competitorGender.male);
        Male c25 = new Male("C025", "David Morley", competitorGender.male);
        Male c26 = new Male("C026", "Callum Mcloughlin", competitorGender.male);
        Male c27 = new Male("C027", "Ahmed Rahman", competitorGender.male);
        Male c28 = new Male("C028", "William Malley", competitorGender.male);
        Female c29 = new Female("C029", "Alisa Edwards", competitorGender.female);
        Female c30 = new Female("C030", "Melissa Clark", competitorGender.female);

        ArrayList<Competitor> competitorInfo = new ArrayList<>();
        competitorInfo.add(c1);
        competitorInfo.add(c2);
        competitorInfo.add(c3);
        competitorInfo.add(c4);
        competitorInfo.add(c5);
        competitorInfo.add(c6);
        competitorInfo.add(c7);
        competitorInfo.add(c8);
        competitorInfo.add(c9);
        competitorInfo.add(c10);
        competitorInfo.add(c11);
        competitorInfo.add(c12);
        competitorInfo.add(c13);
        competitorInfo.add(c14);
        competitorInfo.add(c15);
        competitorInfo.add(c16);
        competitorInfo.add(c17);
        competitorInfo.add(c18);
        competitorInfo.add(c19);
        competitorInfo.add(c20);
        competitorInfo.add(c21);
        competitorInfo.add(c22);
        competitorInfo.add(c23);
        competitorInfo.add(c24);
        competitorInfo.add(c25);
        competitorInfo.add(c26);
        competitorInfo.add(c27);
        competitorInfo.add(c28);
        competitorInfo.add(c29);
        competitorInfo.add(c30);

        //Events
        //Enter in the competitors into the events.
        ArrayList<Competitor> enterInFloorExerciseCompetitors = new ArrayList<>(10);
        enterInFloorExerciseCompetitors.add(c1);
        enterInFloorExerciseCompetitors.add(c2);
        enterInFloorExerciseCompetitors.add(c3);
        enterInFloorExerciseCompetitors.add(c5);
        enterInFloorExerciseCompetitors.add(c6);
        enterInFloorExerciseCompetitors.add(c4);
        enterInFloorExerciseCompetitors.add(c8);
        enterInFloorExerciseCompetitors.add(c11);
        enterInFloorExerciseCompetitors.add(c12);
        enterInFloorExerciseCompetitors.add(c13);

        ArrayList<Competitor> enterInVaultCompetitors = new ArrayList<>(10);
        enterInVaultCompetitors.add(c1);
        enterInVaultCompetitors.add(c2);
        enterInVaultCompetitors.add(c19);
        enterInVaultCompetitors.add(c20);
        enterInVaultCompetitors.add(c5);
        enterInVaultCompetitors.add(c21);
        enterInVaultCompetitors.add(c14);
        enterInVaultCompetitors.add(c15);
        enterInVaultCompetitors.add(c16);
        enterInVaultCompetitors.add(c17);

        ArrayList<Competitor> enterInPommelHorseCompetitors = new ArrayList<>(10);
        enterInPommelHorseCompetitors.add(c1);
        enterInPommelHorseCompetitors.add(c2);
        enterInPommelHorseCompetitors.add(c3);
        enterInPommelHorseCompetitors.add(c5);
        enterInPommelHorseCompetitors.add(c6);
        enterInPommelHorseCompetitors.add(c7);
        enterInPommelHorseCompetitors.add(c9);
        enterInPommelHorseCompetitors.add(c10);
        enterInPommelHorseCompetitors.add(c19);
        enterInPommelHorseCompetitors.add(c20);

        ArrayList<Competitor> enterInStillRingsCompetitors = new ArrayList<>(10);
        enterInStillRingsCompetitors.add(c1);
        enterInStillRingsCompetitors.add(c2);
        enterInStillRingsCompetitors.add(c3);
        enterInStillRingsCompetitors.add(c5);
        enterInStillRingsCompetitors.add(c6);
        enterInStillRingsCompetitors.add(c7);
        enterInStillRingsCompetitors.add(c9);
        enterInStillRingsCompetitors.add(c10);
        enterInStillRingsCompetitors.add(c19);
        enterInStillRingsCompetitors.add(c20);

        ArrayList<Competitor> enterInParallelBarsCompetitors = new ArrayList<>(10);
        enterInParallelBarsCompetitors.add(c6);
        enterInParallelBarsCompetitors.add(c26);
        enterInParallelBarsCompetitors.add(c27);
        enterInParallelBarsCompetitors.add(c28);
        enterInParallelBarsCompetitors.add(c20);
        enterInParallelBarsCompetitors.add(c21);
        enterInParallelBarsCompetitors.add(c22);
        enterInParallelBarsCompetitors.add(c23);
        enterInParallelBarsCompetitors.add(c24);
        enterInParallelBarsCompetitors.add(c25);

        ArrayList<Competitor> enterInHighBarCompetitors = new ArrayList<>(10);
        enterInHighBarCompetitors.add(c22);
        enterInHighBarCompetitors.add(c23);
        enterInHighBarCompetitors.add(c24);
        enterInHighBarCompetitors.add(c25);
        enterInHighBarCompetitors.add(c7);
        enterInHighBarCompetitors.add(c9);
        enterInHighBarCompetitors.add(c10);
        enterInHighBarCompetitors.add(c26);
        enterInHighBarCompetitors.add(c27);
        enterInHighBarCompetitors.add(c28);

        ArrayList<Competitor> enterInUnevenBarsCompetitors = new ArrayList<>(10);
        enterInUnevenBarsCompetitors.add(c4);
        enterInUnevenBarsCompetitors.add(c8);
        enterInUnevenBarsCompetitors.add(c29);
        enterInUnevenBarsCompetitors.add(c30);
        enterInUnevenBarsCompetitors.add(c13);
        enterInUnevenBarsCompetitors.add(c14);
        enterInUnevenBarsCompetitors.add(c15);
        enterInUnevenBarsCompetitors.add(c16);
        enterInUnevenBarsCompetitors.add(c17);
        enterInUnevenBarsCompetitors.add(c18);

        ArrayList<Competitor> enterInBalanceBeamCompetitors = new ArrayList<>(10);
        enterInBalanceBeamCompetitors.add(c18);
        enterInBalanceBeamCompetitors.add(c11);
        enterInBalanceBeamCompetitors.add(c12);
        enterInBalanceBeamCompetitors.add(c13);
        enterInBalanceBeamCompetitors.add(c14);
        enterInBalanceBeamCompetitors.add(c15);
        enterInBalanceBeamCompetitors.add(c16);
        enterInBalanceBeamCompetitors.add(c17);
        enterInBalanceBeamCompetitors.add(c29);
        enterInBalanceBeamCompetitors.add(c30);

        //CommiteeMembers
        CommiteeMember cm1 = new CommiteeMember("Rebecca Clark");
        CommiteeMember cm2 = new CommiteeMember("Lucy Mason");
        CommiteeMember cm3 = new CommiteeMember("Cadie Morgan");
        CommiteeMember cm4 = new CommiteeMember("Amber Edwards");
        CommiteeMember cm5 = new CommiteeMember("Jordan Owens");
        CommiteeMember cm6 = new CommiteeMember("Roman Payne");
        CommiteeMember cm7 = new CommiteeMember("Jasmine Montgomery");
        CommiteeMember cm8 = new CommiteeMember("Daniel Murray");
        CommiteeMember cm9 = new CommiteeMember("Martin Turner");
        CommiteeMember cm10 = new CommiteeMember("Walter Elliott");
        CommiteeMember cm11 = new CommiteeMember("Paul Clark");
        CommiteeMember cm12 = new CommiteeMember("Victor Russell");

        //Commitee Member or Members (members as in more than 2) organising events
        ArrayList<CommiteeMember> organisesFloorExercise = new ArrayList<>();
        organisesFloorExercise.add(cm1);
        organisesFloorExercise.add(cm2);

        ArrayList<CommiteeMember> organisesVault = new ArrayList<>();
        organisesVault.add(cm3);
        organisesVault.add(cm4);

        ArrayList<CommiteeMember> organisesPommelHorse = new ArrayList<>();
        organisesPommelHorse.add(cm5);

        ArrayList<CommiteeMember> organisesStillRings = new ArrayList<>();
        organisesStillRings.add(cm6);

        ArrayList<CommiteeMember> organisesParallelBars = new ArrayList<>();
        organisesParallelBars.add(cm7);

        ArrayList<CommiteeMember> organisesHighBar = new ArrayList<>();
        organisesHighBar.add(cm8);
        organisesHighBar.add(cm9);

        ArrayList<CommiteeMember> organisesUnevenBars = new ArrayList<>();
        organisesUnevenBars.add(cm10);
        organisesUnevenBars.add(cm11);

        ArrayList<CommiteeMember> organisesBalanceBeam = new ArrayList<>();
        organisesBalanceBeam.add(cm12);

        //Routines
        Routine r1 = new Routine("Level 1 - Very Easy", 10, 1);
        Routine r2 = new Routine("Level 2 - Easy", 8, 2);
        Routine r3 = new Routine("Level 3 - Intermediate", 6, 3);
        Routine r4 = new Routine("Level 4 - Hard", 4, 4);
        Routine r5 = new Routine("Level 5 - Very Hard", 2, 5);

        //The Competitor makes an Attempts
        //These attempts are for the floor exersize
        MaleAttempt a1 = new MaleAttempt(r1, c1, 55);
        FemaleAttempt a2 = new FemaleAttempt(r2, c4, 75);
        MaleAttempt a3 = new MaleAttempt(r3, c2, 22);
        FemaleAttempt a4 = new FemaleAttempt(r4, c8, 17);
        MaleAttempt a5 = new MaleAttempt(r5, c3, 81);
        FemaleAttempt a6 = new FemaleAttempt(r1, c11, 31);
        MaleAttempt a7 = new MaleAttempt(r2, c5, 51);
        FemaleAttempt a8 = new FemaleAttempt(r3, c12, 50);
        MaleAttempt a9 = new MaleAttempt(r4, c6, 64);
        FemaleAttempt a10 = new FemaleAttempt(r5, c13, 28);

        ArrayList<Attempt> isForFloorExersize = new ArrayList<>();
        isForFloorExersize.add(a1);
        isForFloorExersize.add(a2);
        isForFloorExersize.add(a3);
        isForFloorExersize.add(a4);
        isForFloorExersize.add(a5);
        isForFloorExersize.add(a6);
        isForFloorExersize.add(a7);
        isForFloorExersize.add(a8);
        isForFloorExersize.add(a9);
        isForFloorExersize.add(a10);

        //These attempts are for the vault exersise, Note: The competitors has two attempts for this at different rouitnes.
        MaleAttempt a11 = new MaleAttempt(r1, c1, 25);
        MaleAttempt a12 = new MaleAttempt(r5, c1, 25);

        FemaleAttempt a13 = new FemaleAttempt(r3, c14, 28);
        FemaleAttempt a14 = new FemaleAttempt(r4, c14, 30);

        MaleAttempt a15 = new MaleAttempt(r5, c2, 57);
        MaleAttempt a16 = new MaleAttempt(r4, c2, 77);

        FemaleAttempt a17 = new FemaleAttempt(r1, c15, 67);
        FemaleAttempt a18 = new FemaleAttempt(r2, c15, 31);

        MaleAttempt a19 = new MaleAttempt(r3, c19, 88);
        MaleAttempt a20 = new MaleAttempt(r5, c19, 73);

        FemaleAttempt a21 = new FemaleAttempt(r5, c16, 43);
        FemaleAttempt a22 = new FemaleAttempt(r2, c16, 31);

        MaleAttempt a23 = new MaleAttempt(r1, c20, 68);
        MaleAttempt a24 = new MaleAttempt(r4, c20, 48);

        FemaleAttempt a25 = new FemaleAttempt(r5, c17, 18);
        FemaleAttempt a26 = new FemaleAttempt(r2, c17, 26);

        MaleAttempt a27 = new MaleAttempt(r1, c5, 89);
        MaleAttempt a28 = new MaleAttempt(r2, c5, 85);

        MaleAttempt a29 = new MaleAttempt(r2, c21, 44);
        MaleAttempt a30 = new MaleAttempt(r3, c21, 52);

        ArrayList<Attempt> isForVault = new ArrayList<>();
        isForVault.add(a11);
        isForVault.add(a12);
        isForVault.add(a13);
        isForVault.add(a14);
        isForVault.add(a15);
        isForVault.add(a16);
        isForVault.add(a17);
        isForVault.add(a18);
        isForVault.add(a19);
        isForVault.add(a20);
        isForVault.add(a21);
        isForVault.add(a22);
        isForVault.add(a23);
        isForVault.add(a24);
        isForVault.add(a25);
        isForVault.add(a26);
        isForVault.add(a27);
        isForVault.add(a28);
        isForVault.add(a29);
        isForVault.add(a30);

        //Attempts for Pommell Horse
        MaleAttempt a31 = new MaleAttempt(r2, c1, 25);
        MaleAttempt a32 = new MaleAttempt(r3, c2, 67);
        MaleAttempt a33 = new MaleAttempt(r4, c3, 23);
        MaleAttempt a34 = new MaleAttempt(r5, c5, 31);
        MaleAttempt a35 = new MaleAttempt(r1, c6, 66);
        MaleAttempt a36 = new MaleAttempt(r2, c7, 50);
        MaleAttempt a37 = new MaleAttempt(r3, c9, 51);
        MaleAttempt a38 = new MaleAttempt(r4, c10, 32);
        MaleAttempt a39 = new MaleAttempt(r5, c19, 2);
        MaleAttempt a40 = new MaleAttempt(r1, c20, 87);

        ArrayList<Attempt> isForPommelHorse = new ArrayList<>();
        isForPommelHorse.add(a31);
        isForPommelHorse.add(a32);
        isForPommelHorse.add(a33);
        isForPommelHorse.add(a34);
        isForPommelHorse.add(a35);
        isForPommelHorse.add(a36);
        isForPommelHorse.add(a37);
        isForPommelHorse.add(a38);
        isForPommelHorse.add(a39);
        isForPommelHorse.add(a40);

        //Attempts for Still Rings
        MaleAttempt a41 = new MaleAttempt(r5, c1, 29);
        MaleAttempt a42 = new MaleAttempt(r4, c2, 33);
        MaleAttempt a43 = new MaleAttempt(r3, c3, 36);
        MaleAttempt a44 = new MaleAttempt(r2, c5, 90);
        MaleAttempt a45 = new MaleAttempt(r1, c6, 89);
        MaleAttempt a46 = new MaleAttempt(r3, c7, 32);
        MaleAttempt a47 = new MaleAttempt(r4, c9, 21);
        MaleAttempt a48 = new MaleAttempt(r5, c10, 19);
        MaleAttempt a49 = new MaleAttempt(r2, c19, 29);
        MaleAttempt a50 = new MaleAttempt(r3, c20, 46);

        ArrayList<Attempt> isForStillRings = new ArrayList<>();
        isForStillRings.add(a41);
        isForStillRings.add(a42);
        isForStillRings.add(a43);
        isForStillRings.add(a44);
        isForStillRings.add(a45);
        isForStillRings.add(a46);
        isForStillRings.add(a47);
        isForStillRings.add(a48);
        isForStillRings.add(a49);
        isForStillRings.add(a50);

        //Attempts for Parallel Bars
        MaleAttempt a51 = new MaleAttempt(r3, c6, 23);
        MaleAttempt a52 = new MaleAttempt(r2, c26, 56);
        MaleAttempt a53 = new MaleAttempt(r1, c27, 23);
        MaleAttempt a54 = new MaleAttempt(r5, c28, 7);
        MaleAttempt a55 = new MaleAttempt(r4, c20, 8);
        MaleAttempt a56 = new MaleAttempt(r3, c21, 33);
        MaleAttempt a57 = new MaleAttempt(r2, c22, 15);
        MaleAttempt a58 = new MaleAttempt(r1, c23, 43);
        MaleAttempt a59 = new MaleAttempt(r5, c24, 23);
        MaleAttempt a60 = new MaleAttempt(r4, c25, 14);

        ArrayList<Attempt> isForParallelBars = new ArrayList<>();
        isForParallelBars.add(a51);
        isForParallelBars.add(a52);
        isForParallelBars.add(a53);
        isForParallelBars.add(a54);
        isForParallelBars.add(a55);
        isForParallelBars.add(a56);
        isForParallelBars.add(a57);
        isForParallelBars.add(a58);
        isForParallelBars.add(a59);
        isForParallelBars.add(a60);

        //Attempts for High Bar
        MaleAttempt a61 = new MaleAttempt(r4, c22, 34);
        MaleAttempt a62 = new MaleAttempt(r3, c23, 66);
        MaleAttempt a63 = new MaleAttempt(r1, c24, 13);
        MaleAttempt a64 = new MaleAttempt(r2, c25, 5);
        MaleAttempt a65 = new MaleAttempt(r5, c7, 17);
        MaleAttempt a66 = new MaleAttempt(r5, c9, 21);
        MaleAttempt a67 = new MaleAttempt(r3, c10, 35);
        MaleAttempt a68 = new MaleAttempt(r2, c26, 42);
        MaleAttempt a69 = new MaleAttempt(r3, c27, 14);
        MaleAttempt a70 = new MaleAttempt(r1, c28, 76);

        ArrayList<Attempt> isForHighBar = new ArrayList<>();
        isForHighBar.add(a61);
        isForHighBar.add(a62);
        isForHighBar.add(a63);
        isForHighBar.add(a64);
        isForHighBar.add(a65);
        isForHighBar.add(a66);
        isForHighBar.add(a67);
        isForHighBar.add(a68);
        isForHighBar.add(a69);
        isForHighBar.add(a70);

        //Attempts for Uneven Bars
        FemaleAttempt a71 = new FemaleAttempt(r2, c4, 56);
        FemaleAttempt a72 = new FemaleAttempt(r3, c8, 34);
        FemaleAttempt a73 = new FemaleAttempt(r4, c29, 20);
        FemaleAttempt a74 = new FemaleAttempt(r5, c30, 10);
        FemaleAttempt a75 = new FemaleAttempt(r3, c13, 46);
        FemaleAttempt a76 = new FemaleAttempt(r1, c14, 86);
        FemaleAttempt a77 = new FemaleAttempt(r2, c15, 71);
        FemaleAttempt a78 = new FemaleAttempt(r4, c16, 32);
        FemaleAttempt a79 = new FemaleAttempt(r5, c17, 12);
        FemaleAttempt a80 = new FemaleAttempt(r1, c18, 78);

        ArrayList<Attempt> isForUnevenBars = new ArrayList<>();
        isForUnevenBars.add(a71);
        isForUnevenBars.add(a72);
        isForUnevenBars.add(a73);
        isForUnevenBars.add(a74);
        isForUnevenBars.add(a75);
        isForUnevenBars.add(a76);
        isForUnevenBars.add(a77);
        isForUnevenBars.add(a78);
        isForUnevenBars.add(a79);
        isForUnevenBars.add(a80);

        //Attempts for Balance Beam
        FemaleAttempt a81 = new FemaleAttempt(r4, c18, 32);
        FemaleAttempt a82 = new FemaleAttempt(r1, c11, 66);
        FemaleAttempt a83 = new FemaleAttempt(r3, c12, 45);
        FemaleAttempt a84 = new FemaleAttempt(r5, c13, 1);
        FemaleAttempt a85 = new FemaleAttempt(r1, c14, 25);
        FemaleAttempt a86 = new FemaleAttempt(r5, c15, 17);
        FemaleAttempt a87 = new FemaleAttempt(r2, c16, 29);
        FemaleAttempt a88 = new FemaleAttempt(r3, c17, 43);
        FemaleAttempt a89 = new FemaleAttempt(r4, c29, 22);
        FemaleAttempt a90 = new FemaleAttempt(r5, c30, 19);

        ArrayList<Attempt> isForBalanceBeam = new ArrayList<>();
        isForBalanceBeam.add(a81);
        isForBalanceBeam.add(a82);
        isForBalanceBeam.add(a83);
        isForBalanceBeam.add(a84);
        isForBalanceBeam.add(a85);
        isForBalanceBeam.add(a86);
        isForBalanceBeam.add(a87);
        isForBalanceBeam.add(a88);
        isForBalanceBeam.add(a89);
        isForBalanceBeam.add(a90);

        //Events
        Event e1 = new Event(g1, "08:00:00 AM", enterInFloorExerciseCompetitors, organisesFloorExercise, isForFloorExersize);
        Event e2 = new Event(g2, "10:00:00 AM", enterInVaultCompetitors, organisesVault, isForVault);
        Event e3 = new Event(g3, "12:00:00 PM", enterInPommelHorseCompetitors, organisesPommelHorse, isForPommelHorse);
        Event e4 = new Event(g4, "02:00:00 PM", enterInStillRingsCompetitors, organisesStillRings, isForStillRings);
        Event e5 = new Event(g5, "04:00:00 PM", enterInParallelBarsCompetitors, organisesParallelBars, isForParallelBars);
        Event e6 = new Event(g6, "06:00:00 PM", enterInHighBarCompetitors, organisesHighBar, isForHighBar);
        Event e7 = new Event(g7, "08:00:00 PM", enterInUnevenBarsCompetitors, organisesUnevenBars, isForUnevenBars);
        Event e8 = new Event(g8, "10:00:00 PM", enterInBalanceBeamCompetitors, organisesBalanceBeam, isForBalanceBeam);

        //Competition has Events.
        ArrayList<Event> eventList = new ArrayList<>();
        eventList.add(e1);
        eventList.add(e2);
        eventList.add(e3);
        eventList.add(e4);
        eventList.add(e5);
        eventList.add(e6);
        eventList.add(e7);
        eventList.add(e8);
        Competition competition = new Competition("Annual Competition", "21/03/2020", eventList);

        //Text-Based Menu(I/O) faclitation the three use cases.
        boolean exit = false;
        do {
            try {
                menuOptionOne();
                Scanner sc1 = new Scanner(System.in);
                int choice = sc1.nextInt();
                switch (choice) {
                    case 1:
                        menuOptionTwo();
                        int choice2 = sc1.nextInt();
                        switch (choice2) {
                            case 1:

                                while (sc1.hasNextLine()) {
                                    menuOptionThree();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("CompetitorId   Competitor Name");
                                        for (Competitor c : enterInFloorExerciseCompetitors) {
                                            c.getMIdName();
                                        }
                                        System.out.println("");
                                        System.out.println("Commitee Members Who Have Organised this event:");
                                        for (CommiteeMember cm : organisesFloorExercise) {
                                            System.out.println(cm.getName());
                                        }
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("CompetitorId   Competitor Name");
                                        for (Competitor c : enterInFloorExerciseCompetitors) {
                                            c.getFIdName();
                                        }
                                        System.out.println("");
                                        System.out.println("Commitee Members Who Have Organised this event:");
                                        for (CommiteeMember cm : organisesFloorExercise) {
                                            System.out.println(cm.getName());
                                        }
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("3")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 2:

                                while (sc1.hasNextLine()) {
                                    menuOptionFour();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("CompetitorId   Competitor Name");
                                        for (Competitor c : enterInPommelHorseCompetitors) {
                                            c.getMIdName();
                                        }
                                        System.out.println("");
                                        System.out.println("Commitee Members Who Have Organised this event:");
                                        for (CommiteeMember cm : organisesPommelHorse) {
                                            System.out.println(cm.getName());
                                        }
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 3:

                                while (sc1.hasNextLine()) {
                                    menuOptionFour();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("CompetitorId   Competitor Name");
                                        for (Competitor c : enterInStillRingsCompetitors) {
                                            c.getMIdName();
                                        }
                                        System.out.println("");
                                        System.out.println("Commitee Members Who Have Organised this event:");
                                        for (CommiteeMember cm : organisesStillRings) {
                                            System.out.println(cm.getName());
                                        }
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 4:

                                while (sc1.hasNextLine()) {
                                    menuOptionThree();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("CompetitorId   Competitor Name");
                                        for (Competitor c : enterInVaultCompetitors) {
                                            c.getMIdName();
                                        }
                                        System.out.println("");
                                        System.out.println("Commitee Members Who Have Organised this event:");
                                        for (CommiteeMember cm : organisesVault) {
                                            System.out.println(cm.getName());
                                        }
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("CompetitorId   Competitor Name");
                                        for (Competitor c : enterInVaultCompetitors) {
                                            c.getFIdName();
                                        }
                                        System.out.println("");
                                        System.out.println("Commitee Members Who Have Organised this event:");
                                        for (CommiteeMember cm : organisesVault) {
                                            System.out.println(cm.getName());
                                        }
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("3")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 5:

                                while (sc1.hasNextLine()) {
                                    menuOptionFour();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("CompetitorId   Competitor Name");
                                        for (Competitor c : enterInParallelBarsCompetitors) {
                                            c.getMIdName();
                                        }
                                        System.out.println("");
                                        System.out.println("Commitee Members Who Have Organised this event:");
                                        for (CommiteeMember cm : organisesParallelBars) {
                                            System.out.println(cm.getName());
                                        }
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 6:

                                while (sc1.hasNextLine()) {
                                    menuOptionFour();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("CompetitorId   Competitor Name");
                                        for (Competitor c : enterInHighBarCompetitors) {
                                            c.getMIdName();
                                        }
                                        System.out.println("");
                                        System.out.println("Commitee Members Who Have Organised this event:");
                                        for (CommiteeMember cm : organisesHighBar) {
                                            System.out.println(cm.getName());
                                        }
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 7:

                                while (sc1.hasNextLine()) {
                                    menuOptionFive();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("CompetitorId   Competitor Name");
                                        for (Competitor c : enterInUnevenBarsCompetitors) {
                                            c.getFIdName();
                                        }
                                        System.out.println("");
                                        System.out.println("Commitee Members Who Have Organised this event:");
                                        for (CommiteeMember cm : organisesUnevenBars) {
                                            System.out.println(cm.getName());
                                        }
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 8:

                                while (sc1.hasNextLine()) {
                                    menuOptionFive();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("CompetitorId   Competitor Name");
                                        for (Competitor c : enterInBalanceBeamCompetitors) {
                                            c.getFIdName();
                                        }
                                        System.out.println("");
                                        System.out.println("Commitee Members Who Have Organised this event:");
                                        for (CommiteeMember cm : organisesBalanceBeam) {
                                            System.out.println(cm.getName());
                                        }
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                        }

                        break;
                    case 2:
                        while (sc1.hasNextLine()) {
                            menuOptionSearchCompetitor();
                            String input = sc1.next();

                            String idC1 = c1.getCompetitionrId() + " " + c1.getName();
                            String idC2 = c2.getCompetitionrId() + " " + c2.getName();
                            String idC3 = c3.getCompetitionrId() + " " + c3.getName();
                            String idC4 = c4.getCompetitionrId() + " " + c4.getName();
                            String idC5 = c5.getCompetitionrId() + " " + c5.getName();
                            String idC6 = c6.getCompetitionrId() + " " + c6.getName();
                            String idC7 = c7.getCompetitionrId() + " " + c7.getName();
                            String idC8 = c8.getCompetitionrId() + " " + c8.getName();
                            String idC9 = c9.getCompetitionrId() + " " + c9.getName();
                            String idC10 = c10.getCompetitionrId() + " " + c10.getName();
                            String idC11 = c11.getCompetitionrId() + " " + c11.getName();
                            String idC12 = c12.getCompetitionrId() + " " + c12.getName();
                            String idC13 = c13.getCompetitionrId() + " " + c13.getName();
                            String idC14 = c14.getCompetitionrId() + " " + c14.getName();
                            String idC15 = c15.getCompetitionrId() + " " + c15.getName();
                            String idC16 = c16.getCompetitionrId() + " " + c16.getName();
                            String idC17 = c17.getCompetitionrId() + " " + c17.getName();
                            String idC18 = c18.getCompetitionrId() + " " + c18.getName();
                            String idC19 = c19.getCompetitionrId() + " " + c19.getName();
                            String idC20 = c20.getCompetitionrId() + " " + c20.getName();
                            String idC21 = c21.getCompetitionrId() + " " + c21.getName();
                            String idC22 = c22.getCompetitionrId() + " " + c22.getName();
                            String idC23 = c23.getCompetitionrId() + " " + c23.getName();
                            String idC24 = c24.getCompetitionrId() + " " + c24.getName();
                            String idC25 = c25.getCompetitionrId() + " " + c25.getName();
                            String idC26 = c26.getCompetitionrId() + " " + c26.getName();
                            String idC27 = c27.getCompetitionrId() + " " + c27.getName();
                            String idC28 = c28.getCompetitionrId() + " " + c28.getName();
                            String idC29 = c29.getCompetitionrId() + " " + c29.getName();
                            String idC30 = c30.getCompetitionrId() + " " + c30.getName();

                            if (idC1.contains(input)) {
                                System.out.println("");
                                a1.setEvent(e1);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a1.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a1.getRoutineDescription());
                                System.out.println("Routin Rating: " + a1.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a11.setEvent(e2);
                                a12.setEvent(e2);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("First Attempt");
                                System.out.println("Event: " + a11.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a11.getRoutineDescription());
                                System.out.println("Routin Rating: " + a11.getRoutineRating());
                                System.out.println("");
                                System.out.println("Second Attempt");
                                System.out.println("Event: " + a12.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a12.getRoutineDescription());
                                System.out.println("Routin Rating: " + a12.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a31.setEvent(e3);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a31.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a31.getRoutineDescription());
                                System.out.println("Routin Rating: " + a31.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a41.setEvent(e4);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a41.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a41.getRoutineDescription());
                                System.out.println("Routin Rating: " + a41.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC2.contains(input)) {
                                System.out.println("");
                                a3.setEvent(e1);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a3.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a3.getRoutineDescription());
                                System.out.println("Routin Rating: " + a3.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a15.setEvent(e2);
                                a16.setEvent(e2);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("First Attempt");
                                System.out.println("Event: " + a15.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a15.getRoutineDescription());
                                System.out.println("Routin Rating: " + a15.getRoutineRating());
                                System.out.println("");
                                System.out.println("Second Attempt");
                                System.out.println("Event: " + a16.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a16.getRoutineDescription());
                                System.out.println("Routin Rating: " + a16.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a32.setEvent(e3);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a32.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a32.getRoutineDescription());
                                System.out.println("Routin Rating: " + a32.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a42.setEvent(e4);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a42.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a42.getRoutineDescription());
                                System.out.println("Routin Rating: " + a42.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC3.contains(input)) {
                                System.out.println("");
                                a5.setEvent(e1);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a5.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a5.getRoutineDescription());
                                System.out.println("Routin Rating: " + a5.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a33.setEvent(e3);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a33.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a33.getRoutineDescription());
                                System.out.println("Routin Rating: " + a33.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a43.setEvent(e4);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a43.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a43.getRoutineDescription());
                                System.out.println("Routin Rating: " + a43.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC4.contains(input)) {
                                System.out.println("");
                                a2.setEvent(e1);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a2.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a2.getRoutineDescription());
                                System.out.println("Routin Rating: " + a2.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a71.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a71.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a71.getRoutineDescription());
                                System.out.println("Routin Rating: " + a71.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC5.contains(input)) {
                                System.out.println("");
                                a7.setEvent(e1);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a7.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a7.getRoutineDescription());
                                System.out.println("Routin Rating: " + a7.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a27.setEvent(e2);
                                a28.setEvent(e2);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("First Attempt");
                                System.out.println("Event: " + a27.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a27.getRoutineDescription());
                                System.out.println("Routin Rating: " + a27.getRoutineRating());
                                System.out.println("");
                                System.out.println("Second Attempt");
                                System.out.println("Event: " + a28.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a28.getRoutineDescription());
                                System.out.println("Routin Rating: " + a28.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a34.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a34.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a34.getRoutineDescription());
                                System.out.println("Routin Rating: " + a34.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a44.setEvent(e4);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a44.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a44.getRoutineDescription());
                                System.out.println("Routin Rating: " + a44.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC6.contains(input)) {
                                System.out.println("");
                                a9.setEvent(e1);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a9.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a9.getRoutineDescription());
                                System.out.println("Routin Rating: " + a9.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a35.setEvent(e3);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a35.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a35.getRoutineDescription());
                                System.out.println("Routin Rating: " + a35.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a45.setEvent(e4);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a45.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a45.getRoutineDescription());
                                System.out.println("Routin Rating: " + a45.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a51.setEvent(e5);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a51.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a51.getRoutineDescription());
                                System.out.println("Routin Rating: " + a51.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC7.contains(input)) {
                                System.out.println("");
                                a36.setEvent(e3);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a36.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a36.getRoutineDescription());
                                System.out.println("Routin Rating: " + a36.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a46.setEvent(e4);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a46.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a46.getRoutineDescription());
                                System.out.println("Routin Rating: " + a46.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a65.setEvent(e6);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a65.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a65.getRoutineDescription());
                                System.out.println("Routin Rating: " + a65.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC8.contains(input)) {
                                System.out.println("");
                                a4.setEvent(e1);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a4.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a4.getRoutineDescription());
                                System.out.println("Routin Rating: " + a4.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a72.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a72.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a72.getRoutineDescription());
                                System.out.println("Routin Rating: " + a72.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC9.contains(input)) {
                                System.out.println("");
                                a37.setEvent(e3);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a37.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a37.getRoutineDescription());
                                System.out.println("Routin Rating: " + a37.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a47.setEvent(e4);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a47.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a47.getRoutineDescription());
                                System.out.println("Routin Rating: " + a47.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a66.setEvent(e6);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a66.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a66.getRoutineDescription());
                                System.out.println("Routin Rating: " + a66.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC10.contains(input)) {
                                System.out.println("");
                                a38.setEvent(e3);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a38.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a38.getRoutineDescription());
                                System.out.println("Routin Rating: " + a38.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a48.setEvent(e4);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a48.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a48.getRoutineDescription());
                                System.out.println("Routin Rating: " + a48.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a67.setEvent(e6);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a67.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a67.getRoutineDescription());
                                System.out.println("Routin Rating: " + a67.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC11.contains(input)) {
                                System.out.println("");
                                a6.setEvent(e1);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a6.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a6.getRoutineDescription());
                                System.out.println("Routin Rating: " + a6.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a82.setEvent(e8);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a82.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a82.getRoutineDescription());
                                System.out.println("Routin Rating: " + a82.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC12.contains(input)) {
                                System.out.println("");
                                a8.setEvent(e1);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a8.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a8.getRoutineDescription());
                                System.out.println("Routin Rating: " + a8.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a83.setEvent(e8);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a83.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a83.getRoutineDescription());
                                System.out.println("Routin Rating: " + a83.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC13.contains(input)) {
                                System.out.println("");
                                a10.setEvent(e1);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a10.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a10.getRoutineDescription());
                                System.out.println("Routin Rating: " + a10.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a75.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a75.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a75.getRoutineDescription());
                                System.out.println("Routin Rating: " + a75.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a84.setEvent(e8);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a84.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a84.getRoutineDescription());
                                System.out.println("Routin Rating: " + a84.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC14.contains(input)) {
                                System.out.println("");
                                a13.setEvent(e2);
                                a14.setEvent(e2);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("First Attempt");
                                System.out.println("Event: " + a13.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a13.getRoutineDescription());
                                System.out.println("Routin Rating: " + a13.getRoutineRating());
                                System.out.println("");
                                System.out.println("Second Attempt");
                                System.out.println("Event: " + a14.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a14.getRoutineDescription());
                                System.out.println("Routin Rating: " + a14.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a76.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a76.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a76.getRoutineDescription());
                                System.out.println("Routin Rating: " + a76.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a85.setEvent(e8);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a85.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a85.getRoutineDescription());
                                System.out.println("Routin Rating: " + a85.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC15.contains(input)) {
                                System.out.println("");
                                a17.setEvent(e2);
                                a18.setEvent(e2);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("First Attempt");
                                System.out.println("Event: " + a17.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a17.getRoutineDescription());
                                System.out.println("Routin Rating: " + a17.getRoutineRating());
                                System.out.println("");
                                System.out.println("Second Attempt");
                                System.out.println("Event: " + a18.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a18.getRoutineDescription());
                                System.out.println("Routin Rating: " + a18.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a77.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a77.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a77.getRoutineDescription());
                                System.out.println("Routin Rating: " + a77.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a86.setEvent(e8);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a86.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a86.getRoutineDescription());
                                System.out.println("Routin Rating: " + a86.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC16.contains(input)) {
                                System.out.println("");
                                a21.setEvent(e2);
                                a22.setEvent(e2);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("First Attempt");
                                System.out.println("Event: " + a21.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a21.getRoutineDescription());
                                System.out.println("Routin Rating: " + a21.getRoutineRating());
                                System.out.println("");
                                System.out.println("Second Attempt");
                                System.out.println("Event: " + a22.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a22.getRoutineDescription());
                                System.out.println("Routin Rating: " + a22.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a78.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a78.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a78.getRoutineDescription());
                                System.out.println("Routin Rating: " + a78.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a87.setEvent(e8);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a87.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a87.getRoutineDescription());
                                System.out.println("Routin Rating: " + a87.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC17.contains(input)) {
                                System.out.println("");
                                a25.setEvent(e2);
                                a26.setEvent(e2);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("First Attempt");
                                System.out.println("Event: " + a25.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a25.getRoutineDescription());
                                System.out.println("Routin Rating: " + a25.getRoutineRating());
                                System.out.println("");
                                System.out.println("Second Attempt");
                                System.out.println("Event: " + a26.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a26.getRoutineDescription());
                                System.out.println("Routin Rating: " + a26.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a78.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a78.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a78.getRoutineDescription());
                                System.out.println("Routin Rating: " + a78.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a87.setEvent(e8);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a87.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a87.getRoutineDescription());
                                System.out.println("Routin Rating: " + a87.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC18.contains(input)) {
                                System.out.println("");
                                a80.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a80.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a80.getRoutineDescription());
                                System.out.println("Routin Rating: " + a80.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a81.setEvent(e8);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a81.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a81.getRoutineDescription());
                                System.out.println("Routin Rating: " + a81.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC19.contains(input)) {
                                System.out.println("");
                                a19.setEvent(e2);
                                a20.setEvent(e2);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("First Attempt");
                                System.out.println("Event: " + a19.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a19.getRoutineDescription());
                                System.out.println("Routin Rating: " + a19.getRoutineRating());
                                System.out.println("");
                                System.out.println("Second Attempt");
                                System.out.println("Event: " + a20.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a20.getRoutineDescription());
                                System.out.println("Routin Rating: " + a20.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a39.setEvent(e3);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a39.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a39.getRoutineDescription());
                                System.out.println("Routin Rating: " + a39.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a49.setEvent(e4);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a49.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a49.getRoutineDescription());
                                System.out.println("Routin Rating: " + a49.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC20.contains(input)) {
                                System.out.println("");
                                a23.setEvent(e2);
                                a24.setEvent(e2);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("First Attempt");
                                System.out.println("Event: " + a23.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a23.getRoutineDescription());
                                System.out.println("Routin Rating: " + a23.getRoutineRating());
                                System.out.println("");
                                System.out.println("Second Attempt");
                                System.out.println("Event: " + a24.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a24.getRoutineDescription());
                                System.out.println("Routin Rating: " + a24.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a40.setEvent(e3);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a40.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a40.getRoutineDescription());
                                System.out.println("Routin Rating: " + a40.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a50.setEvent(e4);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a50.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a50.getRoutineDescription());
                                System.out.println("Routin Rating: " + a50.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a55.setEvent(e5);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a55.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a55.getRoutineDescription());
                                System.out.println("Routin Rating: " + a55.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC21.contains(input)) {
                                System.out.println("");
                                a29.setEvent(e2);
                                a30.setEvent(e2);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("First Attempt");
                                System.out.println("Event: " + a29.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a29.getRoutineDescription());
                                System.out.println("Routin Rating: " + a29.getRoutineRating());
                                System.out.println("");
                                System.out.println("Second Attempt");
                                System.out.println("Event: " + a30.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a30.getRoutineDescription());
                                System.out.println("Routin Rating: " + a30.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a56.setEvent(e5);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a56.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a56.getRoutineDescription());
                                System.out.println("Routin Rating: " + a59.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC22.contains(input)) {
                                System.out.println("");
                                a57.setEvent(e5);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a57.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a57.getRoutineDescription());
                                System.out.println("Routin Rating: " + a57.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a61.setEvent(e6);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a61.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a61.getRoutineDescription());
                                System.out.println("Routin Rating: " + a61.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC23.contains(input)) {
                                System.out.println("");
                                a58.setEvent(e5);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a58.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a58.getRoutineDescription());
                                System.out.println("Routin Rating: " + a58.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a62.setEvent(e6);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a62.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a62.getRoutineDescription());
                                System.out.println("Routin Rating: " + a62.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC24.contains(input)) {
                                System.out.println("");
                                a59.setEvent(e5);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a59.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a59.getRoutineDescription());
                                System.out.println("Routin Rating: " + a59.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a63.setEvent(e6);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a63.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a63.getRoutineDescription());
                                System.out.println("Routin Rating: " + a63.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC25.contains(input)) {
                                System.out.println("");
                                a60.setEvent(e5);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a60.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a60.getRoutineDescription());
                                System.out.println("Routin Rating: " + a60.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a64.setEvent(e6);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a64.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a64.getRoutineDescription());
                                System.out.println("Routin Rating: " + a64.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC26.contains(input)) {
                                System.out.println("");
                                a52.setEvent(e5);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a52.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a52.getRoutineDescription());
                                System.out.println("Routin Rating: " + a52.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a68.setEvent(e6);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a68.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a68.getRoutineDescription());
                                System.out.println("Routin Rating: " + a68.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC27.contains(input)) {
                                System.out.println("");
                                a53.setEvent(e5);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a53.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a53.getRoutineDescription());
                                System.out.println("Routin Rating: " + a53.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a69.setEvent(e6);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a69.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a69.getRoutineDescription());
                                System.out.println("Routin Rating: " + a69.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC28.contains(input)) {
                                System.out.println("");
                                a54.setEvent(e5);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a54.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a54.getRoutineDescription());
                                System.out.println("Routin Rating: " + a54.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a70.setEvent(e6);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a70.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a70.getRoutineDescription());
                                System.out.println("Routin Rating: " + a70.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC29.contains(input)) {
                                System.out.println("");
                                a73.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a73.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a73.getRoutineDescription());
                                System.out.println("Routin Rating: " + a73.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a89.setEvent(e8);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a89.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a89.getRoutineDescription());
                                System.out.println("Routin Rating: " + a89.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            } else if (idC30.contains(input)) {
                                System.out.println("");
                                a74.setEvent(e7);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a74.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a74.getRoutineDescription());
                                System.out.println("Routin Rating: " + a74.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                                System.out.println("");
                                a90.setEvent(e8);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Event: " + a90.getEvent().getEvent().getName());
                                System.out.println("Routine Description: " + a90.getRoutineDescription());
                                System.out.println("Routin Rating: " + a90.getRoutineRating());
                                System.out.println("----------------------------------------------------------");
                            }

                            System.out.println("");
                            break;

                        }
                        break;
                    case 3:
                        menuOptionTwo();
                        int choice3 = sc1.nextInt();
                        switch (choice3) {
                            case 1:

                                while (sc1.hasNextLine()) {
                                    menuOptionThree();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        for (Attempt a : isForFloorExersize) {
                                            a.getMaleAttempts();
                                        }
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        for (Attempt a : isForFloorExersize) {
                                            a.getFemaleAttempts();
                                        }
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("3")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 2:

                                while (sc1.hasNextLine()) {
                                    menuOptionFour();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        for (Attempt a : isForPommelHorse) {
                                            System.out.println(a);
                                        }
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 3:

                                while (sc1.hasNextLine()) {
                                    menuOptionFour();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        for (Attempt a : isForStillRings) {
                                            System.out.println(a);
                                        }
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 4:

                                while (sc1.hasNextLine()) {
                                    menuOptionThree();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        for (Attempt a : isForVault) {
                                            a.getMaleAttempts();
                                        }
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        for (Attempt a : isForVault) {
                                            a.getFemaleAttempts();
                                        }
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("3")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 5:

                                while (sc1.hasNextLine()) {
                                    menuOptionFour();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        for (Attempt a : isForParallelBars) {
                                            System.out.println(a);
                                        }
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 6:

                                while (sc1.hasNextLine()) {
                                    menuOptionFour();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        for (Attempt a : isForHighBar) {
                                            System.out.println(a);
                                        }
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 7:

                                while (sc1.hasNextLine()) {
                                    menuOptionFive();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        for (Attempt a : isForUnevenBars) {
                                            System.out.println(a);
                                        }
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                            case 8:

                                while (sc1.hasNextLine()) {
                                    menuOptionFive();
                                    String input = sc1.next();
                                    if (input.equalsIgnoreCase("1")) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("");
                                        for (Attempt a : isForBalanceBeam) {
                                            System.out.println(a);
                                        }
                                        System.out.println("----------------------------------------------------------");
                                    } else if (input.equalsIgnoreCase("2")) {
                                        System.out.println("");
                                        break;
                                    }
                                }

                                break;
                        }
                        break;
                    case 0:
                        exit = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Input Typing Error");
                System.out.println("");
                continue;
            }
        } while (!exit);
    }

    //Methods to create the menu section of the text-bsed I/O Console.
    public static void menuOptionOne() {
        System.out.println("Gymnastics Event Management System");
        System.out.println("");
        System.out.println("List Event Information........1");
        System.out.println("List Competitor Events........2");
        System.out.println("List Event’s Attempts.........3");
        System.out.println("Exit..........................0");
        System.out.println("");
        System.out.print("Enter Choice > ");
    }

    public static void menuOptionTwo() {
        System.out.println("");
        System.out.println("Floor Exercise.............1");
        System.out.println("Pommel Horse...............2");
        System.out.println("Still Rings................3");
        System.out.println("Vault......................4");
        System.out.println("Parallel Bars..............5");
        System.out.println("High Bar...................6");
        System.out.println("Uneven Bars................7");
        System.out.println("Balance Beam...............8");
        System.out.println("");
        System.out.print("Enter Choice > ");
    }

    public static void menuOptionThree() {
        System.out.println("");
        System.out.println("This Event is for both male and females");
        System.out.println("Male..............1");
        System.out.println("Female............2");
        System.out.println("Back to Main Menu.3");
        System.out.println("");
        System.out.print("Enter Choice > ");
    }

    public static void menuOptionFour() {
        System.out.println("");
        System.out.println("This Event is for male only");
        System.out.println("Male..............1");
        System.out.println("Back to Main Menu.2");
        System.out.println("");
        System.out.print("Enter Choice > ");
    }

    public static void menuOptionFive() {
        System.out.println("");
        System.out.println("This Event is for female only");
        System.out.println("Female..............1");
        System.out.println("Back to Main Menu.2");
        System.out.println("");
        System.out.print("Enter Choice > ");
    }

    public static void menuOptionSearchCompetitor() {
        System.out.println("");
        System.out.print("Search Competitor By ID, Full Name, or Name > ");
    }

}
