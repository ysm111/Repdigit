/**
 * 8進数と16進数で共にゾロ目となるような数を小さい方から3つ表示するプログラム
 * (2進数で'1'が12の倍数個並んだ数は8進数と16進数で共にゾロ目になることを利用して求める)
 */
public class Main {
    public static void main(String[] args){
        /**
         * 8進数と16進数で共にゾロ目となるような数(2進数)
         */
        StringBuilder binary=new StringBuilder();
        /**
         * '1'が12個並んだ数(2進数)
         */
        StringBuilder base=new StringBuilder();

        try{
            //2進数で'1'が12個並んだ数の生成
            for(int i=0;i<12;i++){
                base.append(1);
            }

            for(int i=0;i<3;i++){
                //2進数で'1'が12の倍数個並んだ数の生成
                binary.append(base.toString());
                //2進数で'1'が12の倍数個並んだ数の表示
                System.out.println(Long.parseLong(binary.toString(), 2));
            }
        }catch (Exception e){
            //例外の内容を表示
            e.printStackTrace();
        }
    }
}
