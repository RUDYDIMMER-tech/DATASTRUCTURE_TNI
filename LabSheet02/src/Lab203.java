public class Lab203 {

    public static void main(String[] args) {
        String[] subjects = {"ITE-201", "BIS-112", "DAT-201", "JPN-201", "ENL-211"};
        displayArray("Original", subjects);

        System.out.println();
        String new_subject = "SOC-111";
        subjects = addArraySize(subjects);
        subjects[subjects.length-1] = new_subject;
        displayArray("Already apended element", subjects);

        System.out.println();
        int delete_index1 = 3;
        subjects = deleteElement(delete_index1, subjects);
        displayArray("Already deleted index " + delete_index1, subjects);

        System.out.println();
        int delete_index2 = 0;
        subjects = deleteElement(delete_index2, subjects);
        displayArray("Already deleted index " + delete_index2, subjects);

        System.out.println();
        int delete_index3 = subjects.length-1;
        subjects = deleteElement(delete_index3, subjects);
        displayArray("Already deleted last index", subjects);

        System.out.println();
        int index_update = 1;
        String element_update = "MTE-201";
        subjects = updateElement(index_update, element_update, subjects);
        displayArray("Already updated element", subjects);
    }

    public static void displayArray(String message, String[] subjects) {
        System.out.print(message + ": ");
        boolean first = true;
        for (String subject : subjects) {
            System.out.print((!first ? ", " : "") + subject);
            first = false;
        }
        System.out.println(); // เติมเพื่อขึ้นบรรทัดใหม่ให้สวยงามตามแบบฝึกหัด
    }

    // 1. ฟังก์ชันเพิ่มขนาดอาร์เรย์ (ขยายเพิ่ม 1 ช่อง แล้วส่งอาร์เรย์ใหม่คืนไป)
    public static String[] addArraySize(String[] subjects) {
        // สร้างอาร์เรย์ใหม่ที่มีขนาดมากกว่าของเดิมอยู่ 1 ช่อง
        String[] newArray = new String[subjects.length + 1];
        
        // คัดลอกข้อมูลเดิมทั้งหมดไปใส่อาร์เรย์ใหม่
        for (int i = 0; i < subjects.length; i++) {
            newArray[i] = subjects[i];
        }
        
        // คืนค่าอาร์เรย์ที่ขยายพื้นที่เรียบร้อยแล้ว
        return newArray;
    }

    // 2. ฟังก์ชันลบข้อมูลในอาร์เรย์ตามตำแหน่ง index ที่ระบุ
    public static String[] deleteElement(int index, String[] subjects) {
        // สร้างอาร์เรย์ใหม่ที่ขนาดลดลง 1 ช่อง
        String[] newArray = new String[subjects.length - 1];
        
        int newIndex = 0;
        for (int i = 0; i < subjects.length; i++) {
            // ถ้าดัชนีตรงกับตำแหน่งที่ต้องการลบ ให้ข้ามตัวนี้ไปเลย (ไม่หยิบมาใส่ตัวใหม่)
            if (i == index) {
                continue;
            }
            newArray[newIndex] = subjects[i];
            newIndex++;
        }
        
        // คืนค่าอาร์เรย์ใหม่ที่ถูกลบตัวแปรนั้นออกไปแล้ว
        return newArray;
    }

    // 3. ฟังก์ชันอัปเดตข้อมูลในอาร์เรย์ตามตำแหน่ง index และค่านำเข้าใหม่
    public static String[] updateElement(int index, String value, String[] subjects) {
        // อัปเดตค่าใหม่ทับดัชนีเดิมที่ส่งมา
        if (index >= 0 && index < subjects.length) {
            subjects[index] = value;
        }
        
        // คืนค่าอาร์เรย์ที่ทำการแก้ไขข้อมูลเรียบร้อยแล้วกลับไป
        return subjects;
    }
}