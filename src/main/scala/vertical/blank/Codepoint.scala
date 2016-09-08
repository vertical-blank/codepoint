package vertical.blank

object Codepoint extends App {
  println("Hello, codepoint")
}

case class CodePointString(underlying: String) {
  private[this] val charArray = underlying.toCharArray


  
}

/**
あとで考える
int[] toCodePointArray(String str) {
    CharBuffer cBuf = CharBuffer.wrap(str); // Buffer to wrap str
    IntBuffer iBuf = IntBuffer.             // Buffer to store code points
            allocate(Character.codePointCount(cBuf, 0, cBuf.capacity()));

    if (cBuf.capacity() > 0) {
        int cp; // the current code point
        do {
            cp = Character.codePointAt(cBuf, 0);
            iBuf.put(cp);
        } while (cBuf.position(cBuf.position() + Character.charCount(cp)).
                remaining() > 0);
    }
    return iBuf.array();
}
*/


