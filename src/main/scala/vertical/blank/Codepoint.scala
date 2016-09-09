package vertical.blank

object CodePoint {

  implicit def addToCodePoints(s: String)  = new {
    import java.nio.{CharBuffer, IntBuffer}

    val codePointStrings: List[String] = 
        if (s.isEmpty) List("")
        else {
            val cBuf = CharBuffer.wrap(s)
            val iBuf = IntBuffer.allocate(Character.codePointCount(cBuf, 0, cBuf.capacity))
            
            def impl: Unit = {
                val cp = Character.codePointAt(cBuf, 0)
                iBuf.put(cp)
                if ( cBuf.position(cBuf.position() + Character.charCount(cp)).remaining() > 0 )
                    impl
            }
            impl

            iBuf.array.map(i => String.valueOf(Character.toChars(i))).toList
        }
  }

}

