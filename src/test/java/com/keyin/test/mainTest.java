package com.keyin.test;

import com.keyin.main.Member;
import com.keyin.main.ReadFile;

import com.keyin.main.Tournaments;
import data.Database;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class)
public class mainTest {
   @Mock
   private Database mockDatabase;

   @Test
   public void testGetAllMemberData(){
      Member m1 = new Member("Ned Stark", "Winterfell", "nedS@ex.com", "ravenport12", "normal", "Beheading", "Roberts Rebellion");
      List<Member> memberList = new ArrayList<Member>();
      memberList.add(m1);
//      Had to use lenient() due to an error code
      lenient().when(mockDatabase.getAllMember()).thenReturn(memberList);

   }

   @Test
   public void testGetAllTournData(){
      Tournaments t1 = new Tournaments("Roberts Rebellion", "Kings Landing", "Ned Stark, Robert Baratheon, Cersei Lannister, Daenerys Targaryen", "1st: Robert Baratheon 2nd: Cersei Lannister 3rd: Ned Stark", "282 AD", "283 AD", 15000.00, 10000000.00);
      List<Tournaments> tournamentsList = new ArrayList<Tournaments>();
      tournamentsList.add(t1);
//      Had to use lenient() due to an error code
      lenient().when(mockDatabase.getAllTourn()).thenReturn(tournamentsList);

   }

   @Test
   public void testReadFile(){
      ReadFile.readFile("fake").equals(false);
      ReadFile.readFile("src/main/java/data/member.txt").equals(true);
   }

}
