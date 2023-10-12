package com.max.mathutil.core;

// class nay se chua cac ham static sinh ra de lam tool dung chung
// cho cac noi khac
// ham, ma ko can luu tru gi het, cai do nen la static
// đồ nào mà là static thì gọi trực tiếp qua tên class
// ko bao giờ static qua con dường NEW !!!!!!
public class MathUtility {
    
    public static final double PI=3.14;
    //C#: public const double Pi = 3.14;// ko can chu static ma van la 
                                        // static neu co tu khoa const C# ~ final Java
    
    // ham tinh n! =1.2.3...n
    // ko co giai thua cua so am, n<0 ko tinh dc
    // Neu N qua lon thi Trần Kiều Long, Long thì chịu đc 18 số 0
    
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0 -> 20");
            
        if (n == 0 || n == 1 )
            return 1; //neu co the ket thuc som, thi ket thuc ngay
        
        //song sot den cho nay, sure n = 2..20. Vi neu ko chet giua duong
        // 2 cum if o tren roi, ko can else neu trc do xai return 
        
        long result = 1;
        // nhan don 2 3 4 5 ...n vao bien nay thi thanh n!
        
        for (int i = 2; i <= n; i++)    {
            result *=i;
        }
        return result;
    }
    
}

// Dân DEV viết ra code:hàm, class đồng thời phải có trách nhiệm
// test code của hắn làm ra
// làm sao để test code của chính mình 
// có 3 cách
// cách 1: IN RA MÀN HÌNH KQ XỬ LÍ CỦA HÀM

// CÁCH 2: IN RA LOG FILE

// CÁCH 3: DÙNG ĐỒ CHƠI BÊN NGOÀI ĐEM VÀO - THƯ VIỆN ĐEM VÀO !!!!!

//  NHƯNG DÙ LÀ KIỂM THỬ THẾ NÀO THÌ CX GỒM 3 CÔNG VIỆC
// THIẾT KẾ TEST CASE
// THỰC THI TEST CASE
// GHI BUG NẾU CÓ = LOG BUG

// TEST CASE LÀ: BỘ DATA ĐƯA VÀO APP ĐỂ XEM APP HÀNH XỬ ĐÚNG KO
//              KÈM THÊM EXPECTED VALUE ĐỂ XEM APP TRỞ VỀ GIỐNG KOK
//              KÈM THÊM HƯỚNG DẪN SỬ DỤNG APP VỚI DATA ĐƯA VÀO
//              KÈM THÊM TRẠNG THÁI CỦA TEST CASE: APP ĐÚNG HAY SAI 

// CẤU TRÚC CỦA 1 TEST CASE NHƯ SAU
// (DÙNG TRONG THỰC TẾ ĐI LÀM, VÀ DÙNG TRONG BÀI THI PE)

// MỘT TEST CASE GỒM NHỮNG INFO SAU:
// TEST CASE ID | TEST CASE DESCRIPTION | STEPS/PROCEDURES
// EXPECTED RESULT | STATUS (PASSED | FAILED)

//Test case là tình huống xài app với bộ data đưa vào và giá trị kì
// vọng app trả về
// giờ ta mún test hàm getF() ta phải tk test case coi xem 
// hàm trả về đúng ko 

//TEST CASE #1: VERIFY getFactorial(with n = 0) check 0! correct or not?
//TEST STEPS/PROCEDURES
//          1. Given n = 0
//          2. Call/invoke getFactorial( n = 0 )

//EXPEXTED RESULT:
//      the method must return 1 as the result of 0!

//STATUS: PASSED | FAILED, just waiting 