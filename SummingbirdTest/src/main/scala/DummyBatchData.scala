//package summingbird.proto
//
//import java.io.PrintWriter
//import java.util.Date
//
//import org.slf4j.LoggerFactory
//
//object DummyBatch extends App {
//  import ViewCount._
//
//  @transient private val logger = LoggerFactory.getLogger(this.getClass)
//  logger.info("THIS IS BEING RUN FJASLKDJSLAKDJSA")
//
//  val now = System.currentTimeMillis
//
//  var current = now - 3 * batcher.durationMillis
//  var currentFile: String = null
//  var currentWriter: PrintWriter = null
//
//  while (current < now) {
//    println(current + " " + now)
//    val date = new Date(current)
//
//    val pdpView = randomView(date)
//
//    val fileName = dataFileForBatch(batcher.batchOf(date))
//
//    if (fileName != currentFile) {
//      if (currentWriter != null) currentWriter.close()
//
//      currentFile = fileName
//      currentWriter = new PrintWriter(fileName)
//    }
//
//    currentWriter.println(serializeView(pdpView))
//
//    current += 1000
//  }
//
//  currentWriter.close()
//}
