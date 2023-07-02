package L6_Access_Modifiers;

public class PassObjDemo {
    public static void main(String[] args) {
        Block block1 = new Block(1,2,3);
        Block block2 = new Block(1,2,3);
        Block block3 = new Block(0,2,3);
        Block block4 = new Block(10,2,5);
        Block block5 = new Block(4,5,5);

        System.out.println("are block 1 and 2 equal?"+block1.sameBlock(block2));
        System.out.println("are block 2 and 3 equal?"+block2.sameBlock(block3));
        System.out.println("have block 3 and 4 same volume?"+block3.sameVolume(block4));
        System.out.println("are block 4 and 5 equal?"+block4.sameBlock(block5));
        System.out.println("have block 4 and 5 same volume?"+block4.sameVolume(block5));

        System.out.println();

        Block customBlock = Block.orderBlock();
        System.out.println(customBlock);
    }
}
