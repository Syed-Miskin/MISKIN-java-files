public class Arrays{

public static void main(String[] args){

byte[] dataSpeedInMB={4,8,16,32,64};
short[] storageInGB={128,256,512,1000};
int[] salary={325000,201000,45000,123000,725000};
long[] phoneNumber={7411756321L,7411765242L,9825641852L};
float[] tempertureChanges={27.5f,28.12f,30.88f,31.0f,34.3f};
double[] accurateReadings={56.675624534d,4.6145153425d};
boolean[] returnedBooleanValuesOfEXORGate={true,false,false,true};
char[] semesterWiseGrades={'A','B','C','A','D','A','B'};

System.out.println(storageInGB[2]);
storageInGB[2]=534;
System.out.println(storageInGB[2]);

System.out.println(returnedBooleanValuesOfEXORGate[3]);
System.out.println(salary[0]);
System.out.println(tempertureChanges[1]);
System.out.println(accurateReadings[0]);
System.out.println(semesterWiseGrades[5]);
System.out.println(dataSpeedInMB[1]);
System.out.println(phoneNumber[1]);
}
}