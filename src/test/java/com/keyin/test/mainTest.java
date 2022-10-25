package com.keyin.test;

import com.keyin.main.ReadFile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
@ExtendWith(MockitoExtension.class)
public class mainTest {
   @Mock
   private ReadFile mockReadFile;


   @Test
   public void testGetMemberData(){
      Mockito.when(mockReadFile.readFile("src/main/java/data/member.txt")).thenReturn(true);
   }

   @Test
   public void testSearchMemberData(){

   }
}
