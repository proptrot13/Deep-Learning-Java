package Run;

import Network.DenseNetwork;
import Reader.ImageReader;
import Runner.DenseRunner;
import Util.*;


import java.text.DecimalFormat;
import java.util.Scanner;

/*TODO list:
finish CNN
Nesterov
ResNet
maxout
image transformations
efficient GPU
Unsupervised Preprocessing
RNN
LSTM
L2 Norm
*/

public class RunFullyConnected {

    public static void main(String[] args) throws Exception {

        String trainingDataPath = "C:\\Users\\Anonymous\\Pictures\\Numbers\\mnist_png\\training";
        String testingDataPath = "C:\\Users\\Anonymous\\Pictures\\Numbers\\mnist_png\\testing";
        //"C:\\Users\\Anonymous\\Pictures\\Fortnite\\1\\0.jpg"

        DenseRunner runner = new DenseRunner()
                .setBatchSize(1)
                .setEpochs(1)
                .setIsImage(true)
                .setIterations(1000)
                .setMomentum(.9f)
                .setImageHeight(28)
                .setImageWidth(28)
                .setLayers(new int[]{2352, 200, 10})
                .setTestingIterations(1000)
                .setLearningRate(new float[]{0, .5f, .025f})
                .setDropout(1)
                .setTrainingDataPath(trainingDataPath)
                .setTestingDataPath(testingDataPath);

        runner.train();
        runner.test();
    }
}
