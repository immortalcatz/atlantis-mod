package net.minecraft.src;

public class ModelKraken extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer headc1;
    ModelRenderer body;
    ModelRenderer bodyc1;
    ModelRenderer bodyc2;
    ModelRenderer bodyc3;
    ModelRenderer bodyc4;
    ModelRenderer bodyc5;
    ModelRenderer bodyc6;
    ModelRenderer bodyc7;
    ModelRenderer tail;
    ModelRenderer tailc1;
  
  public ModelKraken()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      head = new ModelRenderer(this, 0, 32);
      head.addBox(0F, 0F, 0F, 10, 16, 16);
      head.setRotationPoint(1F, 8F, -8F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      headc1 = new ModelRenderer(this, 0, 64);
      headc1.addBox(0F, 0F, 0F, 10, 12, 16);
      headc1.setRotationPoint(-9F, 12F, -8F);
      headc1.setTextureSize(64, 32);
      headc1.mirror = true;
      setRotation(headc1, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 0);
      body.addBox(0F, 0F, 0F, 16, 16, 16);
      body.setRotationPoint(12F, 8F, -8F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      bodyc1 = new ModelRenderer(this, 0, 0);
      bodyc1.addBox(0F, 0F, 0F, 16, 16, 16);
      bodyc1.setRotationPoint(29F, 8F, -8F);
      bodyc1.setTextureSize(64, 32);
      bodyc1.mirror = true;
      setRotation(bodyc1, 0F, 0F, 0F);
      bodyc2 = new ModelRenderer(this, 0, 0);
      bodyc2.addBox(0F, 0F, 0F, 16, 16, 16);
      bodyc2.setRotationPoint(46F, 8F, -8F);
      bodyc2.setTextureSize(64, 32);
      bodyc2.mirror = true;
      setRotation(bodyc2, 0F, 0F, 0F);
      bodyc3 = new ModelRenderer(this, 0, 0);
      bodyc3.addBox(0F, 0F, 0F, 16, 16, 16);
      bodyc3.setRotationPoint(63F, 8F, -8F);
      bodyc3.setTextureSize(64, 32);
      bodyc3.mirror = true;
      setRotation(bodyc3, 0F, 0F, 0F);
      bodyc4 = new ModelRenderer(this, 0, 0);
      bodyc4.addBox(0F, 0F, 0F, 16, 16, 16);
      bodyc4.setRotationPoint(80F, 8F, -8F);
      bodyc4.setTextureSize(64, 32);
      bodyc4.mirror = true;
      setRotation(bodyc4, 0F, 0F, 0F);
      bodyc5 = new ModelRenderer(this, 0, 0);
      bodyc5.addBox(0F, 0F, 0F, 16, 16, 16);
      bodyc5.setRotationPoint(97F, 8F, -8F);
      bodyc5.setTextureSize(64, 32);
      bodyc5.mirror = true;
      setRotation(bodyc5, 0F, 0F, 0F);
      bodyc6 = new ModelRenderer(this, 0, 0);
      bodyc6.addBox(0F, 0F, 0F, 16, 16, 16);
      bodyc6.setRotationPoint(114F, 8F, -8F);
      bodyc6.setTextureSize(64, 32);
      bodyc6.mirror = true;
      setRotation(bodyc6, 0F, 0F, 0F);
      bodyc7 = new ModelRenderer(this, 0, 0);
      bodyc7.addBox(0F, 0F, 0F, 16, 16, 16);
      bodyc7.setRotationPoint(131F, 8F, -8F);
      bodyc7.setTextureSize(64, 32);
      bodyc7.mirror = true;
      setRotation(bodyc7, 0F, 0F, 0F);
      tail = new ModelRenderer(this, 64, 0);
      tail.addBox(0F, 0F, 0F, 10, 10, 10);
      tail.setRotationPoint(148F, 11F, -5F);
      tail.setTextureSize(64, 32);
      tail.mirror = true;
      setRotation(tail, 0F, 0F, 0F);
      tailc1 = new ModelRenderer(this, 64, 20);
      tailc1.addBox(0F, 0F, 0F, 7, 6, 6);
      tailc1.setRotationPoint(158F, 13F, -3F);
      tailc1.setTextureSize(64, 32);
      tailc1.mirror = true;
      setRotation(tailc1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    headc1.render(f5);
    body.render(f5);
    bodyc1.render(f5);
    bodyc2.render(f5);
    bodyc3.render(f5);
    bodyc4.render(f5);
    bodyc5.render(f5);
    bodyc6.render(f5);
    bodyc7.render(f5);
    tail.render(f5);
    tailc1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
