package com.keyin.test;

import com.keyin.main.Member;
import com.keyin.main.ReadFile;

import data.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class)
public class mainTest {
   @Mock
   private Database mockDatabase;


   @Test
   public void testGetMemberData(){
      Member m1 = new Member("Ned Stark", "Winterfell", "nedS@ex.com", "ravenport12", "normal", "Beheading", "Roberts Rebellion");
      List<Member> memberList = new ArrayList<Member>();
      memberList.add(m1);
      System.out.println(memberList);
//      Had to use lenient() due to an error code
      lenient().when(mockDatabase.getAllMember()).thenReturn(memberList);

   }



}
